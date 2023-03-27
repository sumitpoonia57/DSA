// Find the two non repeating element in array where every element repeat twice 
public class BitManipulation {
    public static void Unique(int arr[], int n) {
        int sum = 0;
        // Calculate xor of sum with all elements of array it will return sum=3^2
        for (int i = 0; i < n; i++) {
            sum = sum ^ arr[i];
        }
        // Calculating right most significant bit of sum so that array can divide into
        // two condition
        sum = sum & -sum;// it right most set significant bit
        int sum1 = 0;
        int sum2 = 0;
        // two different variable that will store 2 different unique elements
        // Traversing the whole array
        for (int i = 0; i < n; i++) {
            if ((arr[i] & sum) > 0) {
                sum1 = sum1 ^ arr[i];
            } else {
                sum2 = sum2 ^ arr[i];
            }
        }
        // Two different elements in array
        System.out.println("Two different unique elements are:" + sum1 + " " + sum2);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 4, 3, 5, 1, 2 };
        int n = arr.length;
        Unique(arr, n);

    }

}
