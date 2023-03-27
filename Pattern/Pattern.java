import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        // Print the solid rectangle
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print hollow cylinder
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Inverse Pyramid
        for (int c = n; c >= 1; c--) {
            for (int d = 1; d <= c; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print Half Pyramid
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // Inverted half pyramid by 180 degree
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
