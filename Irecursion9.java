import java.util.HashSet;

public class Irecursion9 {
    public static void Subsequences(String str, int idx, String newString, HashSet hashSet) {
        if (idx == str.length()) {
            if (hashSet.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                hashSet.add(newString);
                return;
            }
        }
        char currchar = str.charAt(idx);
        // Want to include in string
        Subsequences(str, idx + 1, newString + currchar, hashSet);
        // Not want to include in string
        Subsequences(str, idx + 1, newString, hashSet);
    }

    public static void main(String[] args) {
        // Print Unique subsequences of string
        String str = "aaa";
        HashSet<String> hashSet = new HashSet();
        Subsequences(str, 0, "", hashSet);

    }

}
