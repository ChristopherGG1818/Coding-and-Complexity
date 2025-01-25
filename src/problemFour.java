public class problemFour {
    public static void main(String[] args) {
        int terms = 10;
        System.out.println( terms );
        NotFibonacci(terms);
    }
    public static void NotFibonacci(int terms) {
        long A = 0;
        long B = 1;
        System.out.print(A + ", " + B);
        for (int i = 2; i < terms; i++) {
            long current = (3 * B) + (2 * A);
            System.out.print(", " + current);
            A = B;
            B = current;
        }
        System.out.println();

    }
}