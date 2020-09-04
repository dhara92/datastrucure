public class pricesProfit {




        public static void  main(String[] str) {

            long[] prices = new long[]{6,0,-1,10};
            // Type your solution here
            int unsortedpartion = prices.length-1;
            long temp;
            long result;
            long finalResult = 0 ;

            for (int j = unsortedpartion; j >0 ; j--) {


                for (int i = 0; i < prices.length-1; i++) {

                    if (prices[i] > prices[i + 1]) {
                        temp = prices[i];
                        prices[i] = prices[i + 1];
                        prices[i + 1] = temp;
                    }
                }
                unsortedpartion--;
            }

            for(int i = 0; i < prices.length ;i++){

                result = prices[i] - prices[0];

                System.out.println(result);

            }


    }


}
