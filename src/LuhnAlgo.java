public class LuhnAlgo {

    public static void main(String[] args) {

        //String cardNo = "79927398713";
        String cardNo = "941724296";

        int nDigits = cardNo.length();
        System.out.println( nDigits);
        boolean isSecond = false;
        int nSum = 0;

        for (int i = nDigits - 1; i >= 0 ; i--) {

            int d = cardNo.charAt(i)  - '0';

            if(isSecond == true){
                d = d * 2;
            }

            nSum += d / 10;
            nSum += d % 10;

            isSecond = !isSecond;


        }

        if((nSum%10) ==0){
            System.out.println("card valid");
        }
        else
            System.out.println("card not valid ");

    }
}
