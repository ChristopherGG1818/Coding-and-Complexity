//01/21/2024
//Christopher Garcia
//Introduction to Algorithms
public class Main {
    public static int problemOne(String text1, String text2){
        int count = 0;
        for (int i = 0; i < text1.length() && i < text2.length(); i++) {
            if (text1.charAt(i) == text2.charAt(i)){
                count++;
                System.out.println( i + " are equal");
            } else {
                System.out.println( i + " are not equal");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //String text1 = ("abc");
        //String text2 = ("abc");
        //String text1 = "almanacs";
        //String text2 = ("albatross");
        String text1 = ("almanac");
        String text2 = ("ferris");
        System.out.println(problemOne(text1, text2));
    }

}
