package Arrays;

import java.util.*;

public class PrefixSum {
    public static void subArrays(int num[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int prefix[]=new int[num.length];
        // calculate prefix array
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        System.out.print(Arrays.toString(prefix));
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int sum = 0;
                if(i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        System.out.println("Maximum Sum:" + max);
       
    }
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12 };
        subArrays(num);

    }

}
