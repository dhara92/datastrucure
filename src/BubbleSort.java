public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = new int[]{20,35,-15,7,55,1,-22};
        int unsortedpartion = numbers.length-1;
        int temp;

        for (int j = unsortedpartion; j >0 ; j--) {


            for (int i = 0; i < numbers.length-1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            unsortedpartion--;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

