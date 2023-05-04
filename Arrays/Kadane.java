package Arrays;

import java.util.*;

// write a program to find maximum subarray using kadane algorithm
public class Kadane {
    public static void subArrays(int num[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
            // Math.max function is also use to  find maximum value 
        }
    System.out.println("Maximum Sum:" + max);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12 };
        subArrays(num);
    }
}
