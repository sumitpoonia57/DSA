package Sorting;

//write a program to sort array using bubblesort
import java.util.*;

public class BubbleSort {
    public static int[] BSort(int num[]) {
        // no of turns=n-2;
        for (int i = 0; i <= num.length - 2; i++) {
            for (int j = 0; j <= num.length - 2 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }

            }
        }

        return num;

    }

    public static void main(String[] args) {
        int num[] = { 7, 1, 5, 8, 3, 0, 6 };
        System.out.print(Arrays.toString(BSort(num)));

    }

}
