public class Recursion2 {
    // Print sum of n natural numbers

    public static void Printsum(int i, int n, int sum) {
        // base condition
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        Printsum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        Printsum(1, n, sum);

    }

}
