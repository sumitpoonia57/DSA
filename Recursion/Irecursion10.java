public class Irecursion10 {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void Combination(String str, int idx, String combination) {
        // Base case
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            Combination(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        // Phone Keypad Combination
        String str = "23";
        System.out.println(str.length()+"str");
        Combination(str, 0, " ");

    }

}
