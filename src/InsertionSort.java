public class InsertionSort {

    public static void main(String[] args) {

        int[] number = new int[]{20, 35, -15, 7, 55, 1, -22};

        int temp;
        int largest;

        for (int FirstunsortedIndex = 1; FirstunsortedIndex <  number.length; FirstunsortedIndex++) {

            int newElement = number[FirstunsortedIndex];
            int i;
            for ( i = FirstunsortedIndex; i > 0 &&   number[i-1] > newElement; i--) {
                number[i] = number[i-1];

            }
            number[i] = newElement;

        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}


