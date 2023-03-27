import javax.print.DocFlavor.READER;

public class Intermidaterecursion3 {
    public static int first = -1;
    public static int last = -1;

    public static void Ocurrence(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        Ocurrence(str, idx + 1, element);

    }

    public static void main(String[] args) {
        // find first and last index occurence of element
        String str = "abaacdaefaah";
        Ocurrence(str, 0, 'a');
    }

}
