public class ShellSort {
    public static void main(String[] args) {

        int[] number = new int[]{20, 35, -15, 7, 55, 1, -22};


        for (int gap = number.length/2; gap > 0; gap /= 2) {

            for (int i = gap; i < number.length ; i++) {
                    int newElement = number[i];
                    int j = i;

                    while (j>=gap && number[j-gap] > newElement){
                        number[j] = number[j-gap];
                        j-=gap;
                    }
                    number[j]=newElement;
            }
        }




        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i]);
        }
    }
}
