//01/21/2024
//Christopher Garcia
//Introduction to Algorithms
public class problemFour {
    public static void main(String[] args) {
        long input = 1640;  //Constant 0(1)
        int count = NotFibonacci(input); //0(N)
        System.out.println(count);  //Constant 0(1)
    }
    public static int NotFibonacci(long number) {
        long A = 0; //Constant 0(1)
        long B = 1; //Constant 0(1)

        int position = 2;  //Constant 0(1)
        while (true) {
            long current = (3 * B) + (2 * A);  //Constant 0(1)
            position++; //0(1)

            if (current == number) {  //Constant 0(1) condition stamement
                return position;  //Constant 0(1)
            } else if (current > number) {  //Constant 0(1)
                return position - 1;  //Constant 0(1)
            }
            A = B;  //Constant 0(1)
            B = current;  //Constant 0(1)
        }
    }
}