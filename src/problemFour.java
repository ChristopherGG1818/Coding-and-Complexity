public class problemFour {
    public static void main(String[] args) {
        long input = 1640;
        int count = NotFibonacci(input);
        System.out.println(count);
    }
    public static int NotFibonacci(long number) {
        long A = 0;
        long B = 1;

        int position = 2;
        while (true) {
            long current = (3 * B) + (2 * A);
            position++;

            if (current == number) {
                return position;
            } else if (current > number) {
                return position - 1;
            }
            A = B;
            B = current;
        }
    }
}