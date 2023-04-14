public class IntermidiateRecursion {
    public static void Tower(int n, String src, String helper, String destination) {
        // base condition
        if (n == 1) {
            System.out.println("Transfer disk " + n + "from " + src + "to " + destination);
            return;
        }
        // transfer n-1 disk from source to helper
        Tower(n - 1, src, destination, helper);
        System.out.println("Transfer disk " + n + "from " + src + "to " + helper);
        // Transfer n disk from source to destination
        Tower(n - 1, helper, src, destination);

    }

    public static void main(String[] args) {
        // Tower of Hanoi
        int n = 5;
        Tower(n, "S", "H", "D");

    }
}
