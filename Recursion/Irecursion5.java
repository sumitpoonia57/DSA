public class Irecursion5 {
    public static boolean Sorted(int arr[], int idx) {
        // base condition
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        Sorted(arr, idx + 1);
        return true;

    }

    public static void main(String[] args) {
        // check if array is sorted or not
        int arr[] = { 3, 4, 5, 6 };
        System.out.println(Sorted(arr, 0));
     

    }

}
