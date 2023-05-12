package Sorting;
import java.util.*;

public class InsertionSort {
    public static int[] Insertion(int num[]){
        int n=num.length;
        for(int i=1;i<n;i++){
            int curr=num[i];
            int prev=i-1;
            while(prev>=0 && num[prev]>curr){
                num[prev+1]=num[prev];
                prev--;
            }
            // insertion
            num[prev+1]=curr;
        }
        return num;
    }

    public static void main(String[] args) {
        int num[]={2,5,6,78,19};
        System.out.print(Arrays.toString(Insertion(num))); 
    }
    
}
