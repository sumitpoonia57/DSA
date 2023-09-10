public class Irecursion8 {
    public static void Subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        // Want to include in string
        Subsequences(str, idx + 1, newString + currchar); //abc....   
    // Not want to include in string
        Subsequences(str, idx + 1, newString);
    }
    public static void main(String[] args) {
        // Print all subsequences of string
        String str = "abc";
        Subsequences(str, 0, " ");
    }

}
