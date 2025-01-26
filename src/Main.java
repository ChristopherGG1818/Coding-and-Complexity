//01/21/2024
//Christopher Garcia
//Introduction to Algorithms
public class Main {
    public static int problemOne(String text1, String text2) {
        int A = text1.length(); //Constant 0(1)
        int B = text2.length(); //Constant 0(1)

        int[] count = new int[B + 1]; //0(1)
        for (int i = 1; i <= A; i++) { //(A) loop
            int prev = 0; //Constant 0(1)
            for (int j = 1; j <= B; j++) { //(B) nested b loop
                int temp = count[j]; //Constant 0(1)
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) { //Constant 0(1)
                    count[j] = prev + 1; //Constant 0(1)
                } else {
                    count[j] = Math.max(count[j], count[j - 1]); //Constant 0(1)
                }
                prev = temp; //Constant 0(1)
            }
        }
        return count[B]; //Constant 0(1)
    }
    public static void main(String[] args) {
        //String text1 = ("abc");
        //String text2 = ("abc");
        //String text1 = "almanacs";
        String text2 = ("albatross");
        String text1 = ("almanac");
        //String text2 = ("ferris");
        System.out.println(problemOne(text1, text2));
    }
}
