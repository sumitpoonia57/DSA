// Find only non repeating element in array where every other element repeat k times
public class BitPractice2 {
    public static int Unique(int arr[], int k) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int p = 0;
            // Calculating bit for every element and store element in variable p
            for (int j = 0; j < arr.length; j++) {
                if ((Math.abs(arr[j]) & (1 << i)) != 0) {
                    p += 1;
                } else {
                    p += 0;
                }
            }
            // Taking modulo of p to calcuate element which doesnot repeat k times
            p %= k;
            // Obtain Result
            result += Math.pow(2, i) * p;
        }
        int c = 0;
        // For negative element if present in array
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == result) {
                c = 1;
                break;
            }

        }
        if (c == 1) {
            return result;
        } else {
            return -result;
        }

    }

    public static void main(String[] args) {
        int arr[] = {-2,-2,1,1,4,1,4,4,-4,-2};
        int k = 3;
        System.out.println(Unique(arr, k));

    }

}
