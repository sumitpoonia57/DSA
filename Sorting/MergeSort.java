package Sorting;
// write a program to sort array using merge sort
//MergeSort using Recursion
import java.util.*;

public class MergeSort {
    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
        System.out.println();
    }

    public static void mergeSort(int num[],int si,int end){
        if(si >=end){
            return;
        }
        // kaam
        int mid=si+(end-si)/2;
        // Left
        mergeSort(num, si, mid);
        // right
        mergeSort(num, mid+1, end);
        Merge(num,si,mid,end);
    }
    public static void Merge(int num[],int si,int mid,int end){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[end-si+1];
        while(i<=mid && j<=end){
            if(num[i]<num[j]){
                temp[k]=num[i];
                i++;
            }
            else{
                temp[k]=num[j];
                j++;
            }
            k++;
        }
        // leftover element of left side;
        while(i<=mid){
            temp[k++]=num[i++];

        }
        // leftover element of right side
        while(j<=end){
            temp[k++]=num[j++];

        }
        // copying of temp array element in original array
        for(  k=0,i=si;k<temp.length;k++,i++){
            num[i]=temp[k];

        }

    }
    public static void main(String[] args) {
        int num[]={2,5,6,78,11,23};
        mergeSort(num, 0,num.length-1);
        printArray(num);
        
        
    }
    
}
