// Palindrome Of
public class Palindrome {
    public static void Number(int n) {
        int rev = 0;
        int temp = n;
        for (int i = 0; i <= n; i++) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    public static void main(String[] args) {
        Number(125);

    }

}
