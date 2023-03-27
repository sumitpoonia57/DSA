// Find the only non repating element in array where element repeat twice
public class AdvanceBitManipulation {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 4, 3, 5, 1, 2 };
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);

    }

}
