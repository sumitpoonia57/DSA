public class Irecursion6 {
    // print all x at the end of x;
    public static void Last(String str, int idx, int count, String newString) {
        // Base Condition
        if (idx == str.length()) {
            for (int i = 1; i <= count; i++) {
                newString += 'x';

            }
            System.out.print(newString);
            return;

        }
        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            Last(str, idx + 1, count, newString);
        } else {
            newString += currchar;
            Last(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abcdxxx";
        Last(str, 0, 0, "");

    }

}
