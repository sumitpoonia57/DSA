public class Intermidaterecursion2 {
    public static void Reverse(String str, int i) {
        if (i == 0) {
            // Base condition
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        Reverse(str, i - 1);

    }

    public static void main(String[] args) {
        // print reverse of string
        String str = "Sumit";
        Reverse(str, str.length() - 1);

    }

}
