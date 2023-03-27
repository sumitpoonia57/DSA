public class Recursion1 {
    public static void Printnum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Printnum(n - 1);
    }

    public static void Printnumb(int m) {
        if (m == 6) {
            return;
        }
        System.out.println(m);
        Printnumb(m + 1);
    }

    public static void main(String[] args) {
        // Print Numbers from 5 to 1 using recursion
        int n = 5;
        Printnum(n);
        // Print Numbers from 1 to 5;
        int m = 1;
        Printnumb(m);

    }

}
