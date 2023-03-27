public class Recursion3 {
    // program to calculate factorial of number
    public static int CalFac(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        int fact = CalFac(n - 1);
        int factorial = n * fact;
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalFac(n));

    }

}
