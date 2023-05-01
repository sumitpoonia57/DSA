package Arrays;
import java.util.*;
// Find Largest Number in Array

public class LargestNumber {
    public static int Largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={12,13,14,15,6};
        System.out.println(Largest(arr));
        
    }
    
}
