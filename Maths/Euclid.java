public class Euclid {
    // Find GCD of Two number
    public static int Gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return Gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 60;
        System.out.println(Gcd(a, b));

    }

}
