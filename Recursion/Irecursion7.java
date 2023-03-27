public class Irecursion7 {
    // declaring map array
    public static boolean map[] = new boolean[26];

    public static void Duplicates(String str, int idx, String newString) {
        // Base Case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            Duplicates(str, idx + 1, newString);
        } else {
            newString = newString + currchar;
            map[currchar - 'a'] = true;
            Duplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        // removes duplicates from string
        String str = "abbccda";
        Duplicates(str, 0, "");
    }

}
