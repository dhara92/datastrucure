public class SelectionSort {
    public static void main(String[] args) {

        int[] number = new int[]{20,35,-15,7,55,1,-22};

        int temp;
        int largest;

        for (int unsortedpartion = number.length-1; unsortedpartion> 0 ; unsortedpartion--) {

            largest = 0;

            for (int i = 1; i <= unsortedpartion; i++) {

                if ( number[i] > number[largest]) {
                    largest = i;
                }
                temp = number[largest];
                number[largest] = number[unsortedpartion];
                number[unsortedpartion] = temp;
            }
            unsortedpartion--;
        }

            for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
