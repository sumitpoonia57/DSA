public class Factorial {
    // To Calculalate factorial of Number
    static void factorial(int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int n = 12;
        factorial(n);

    }

}
