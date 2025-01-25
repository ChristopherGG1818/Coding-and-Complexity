//01/21/2024
//Christopher Garcia
//Introduction to Algorithms
public class Main {
    public static int problemOne(String text1, String text2){
        int A = text1.length();
        int B = text2.length();

        int[][] count = new int[A + 1][B + 1];
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= B; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    count[i][j] = count[i - 1][j - 1] + 1;
                } else {
                    count[i][j] = Math.max(count[i - 1][j], count[i][j - 1]);
                }
            }
        }
        return count[A][B];
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
