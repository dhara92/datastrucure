public class factorialNumber {
    public static void main(String[] args) {

    int i = factorial(5);
        System.out.println(i);
        int j = recursive(5);
        System.out.println(j);
    }
    public  static int factorial(int num){
            if(num == 0){
                return  1;
            }
             int factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public  static int recursive(int num){
        if(num == 0){
            return  1;
        }
        return  num *recursive(num-1);
    }
}
