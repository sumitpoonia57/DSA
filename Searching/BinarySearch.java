package Searching;
import java.util.*;
// write a program to find element using binary search in sorted array
public class BinarySearch {
    public static int Sort(int arr[],int key,int si,int ei){
        // kaam
        int mid=(si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(key>arr[mid]){
           return  Sort(arr, key, mid+1, ei);
        }
        return Sort(arr, key, si, mid-1);

    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7};
        int key=5;
        int index=Sort(num, 5, 0, num.length-1);
        System.out.println(index);
        
    }
    
}
