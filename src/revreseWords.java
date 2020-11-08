public class revreseWords {
    public static void main(String[] args) {

        String str = "Bob likes dogs";

        String[] arr = str.split(" ");

        StringBuilder newString = new StringBuilder();
        for(int i= arr.length- 1; i >= 0; i--){
            newString.append(arr[i]);
            newString.append(" ");
        }

        System.out.println(newString);
    }
}