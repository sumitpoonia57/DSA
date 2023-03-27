public class Bitmaskpractice {
    public static void Count(int n) {
        int count = 0;
        while (n != 0) {
            // Optimised Approach
            // Another approach be like that
            n &= n - 1;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        // Find no of bits require to change a from b;
        int a = 10;
        int b = 20;
        int n = a ^ b;
        Count(n);

    }

}
