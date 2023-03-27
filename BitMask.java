public class BitMask {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        /* Get Bit */
        if ((bitmask & n) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one");
        }
        /* Set Bit */
        int number = bitmask | n;
        System.out.println(number);
        /* Clear Bit */
        int newbitmask = ~(1 << pos);
        int num = n & newbitmask;
        System.out.println(num);

    }

}
