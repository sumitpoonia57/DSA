public class Recursion5 {
    // calculate x^n;
    public static int CalcPow(int x, int n) {
        if (n == 0) { // Base condition 1
            return 1;
        }
        if (x == 0) {
            return 0;// Base Condn2
        }
        int powx = CalcPow(x, n - 1);
        int power = x * powx;
        return power;
    }

    public static void main(String[] args) {
        int x = 4;
        int n = 5;
        System.out.println(CalcPow(x, n));

    }

}
