import java.util.Arrays;

public class Sieve {
    // boolean[] it show that function will return boolean[] at the end of function
    public static boolean[] sieveofEratosthenes(int n) {
        boolean[] arr = new boolean[n + 1];
        arr[0] = false;
        arr[1] = false;
        // Method to make all the elements in array as true;
        Arrays.fill(arr, true);
        // Loop to make number that are prime and there multiple as false
        for (int i = 2; i * i <= n; i++) {// First loop to make non prime number as false from 2 to n
            // it is use to make multiple of 2,3, or prime number as prime
            for (int j = 2 * i; j <= n; j = j + i) {
                arr[j] = false;
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        boolean arr[] = sieveofEratosthenes(100);
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " " + arr[i]);
        }

    }

}
