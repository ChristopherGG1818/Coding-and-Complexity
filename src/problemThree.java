//01/21/2024
//Christopher Garcia
//Introduction to Algorithms
public class problemThree {
    public static void main(String[] args) {
        int terms = 10; //Constant 0(1)
        System.out.println( terms ); //Constant 0(1)
        NotFibonacci(terms); //(n)
    }
    public static void NotFibonacci(int terms) {
        long A = 0; //Constant 0(1)
        long B = 1; //Constant 0(1)
        System.out.print(A + ", " + B);//Constant 0(1)

        for (int i = 2; i < terms; i++) { //0(N) looop runnnig N times
            long current = (3 * B) + (2 * A);//Constant 0(1)
            System.out.print(", " + current); //Constant 0(1)
            A = B; //Constant 0(1)
            B = current; //Constant 0(1)
        }
        System.out.println(); //Constant 0(1)
    }
}