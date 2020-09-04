public class ReverseString {


    public static void main(String str1[]){
        String str = "Dhara";
        StringBuilder newString = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {

            newString.append(str.charAt(i));
        }
        System.out.println("Main string: " + str.toString());
        System.out.println("Reverse string: " + newString.toString());


    }
}

