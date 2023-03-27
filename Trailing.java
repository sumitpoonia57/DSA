public class Trailing {
    // Write program to calculate trailing zeroes
    public static void Zeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count = count + n / i;

        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        Zeroes(12);

    }

}
