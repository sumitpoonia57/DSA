package Sorting;
//write a program to do sorting using Seletion sort approach
import java.util.*;

public class SelectionSort {
    public static int[] SortS(int num[]){
        int n=num.length;
    // no of turns
    for(int i=0;i<=n-1;i++){
        int min=i;
        for(int j=i+1;j<=n-1;j++){
            if(num[j]<num[min]){
                min=j; 
            }
        }
        int temp=num[min];
        num[min]=num[i];
        num[i]=temp;

    }
        return num;
    }

    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        System.out.print(Arrays.toString(SortS(num)));   
    }  
}
