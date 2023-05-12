package Sorting;
import java.util.*;

public class CountSort {
    public static int[] Count(int num[]){
       int n=num.length;
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        largest=Math.max(largest, num[i]);
       }
       // Make Count Array of size largest
       int count[]=new int[largest+1];
       for(int i=0;i<n;i++){
          count[num[i]]++;
       }
       // Sorting
       int j=0;
       for(int i=0;i<largest;i++){
         while(count[i]>0){
            num[j]=i;
            j++;
            count[i]--;
         }
       }
       return num;

    }
    public static void main(String[] args) {
        int num[]={1,1,2,3,3,4,4,7};
        System.out.print((Arrays.toString(Count(num))));
        
    }
    
}
