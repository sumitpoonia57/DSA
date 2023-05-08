package Sorting;
// write a program to do sorting udding seletion sort
import java.util.*;

public class SelectionSort {

    public static int[] Selection(int num[]){
        int n=num.length;
    // no of turns
    int temp=Integer.MAX_VALUE;
    for(int i=0;i<n-2;i++){
        for(int j=i+1;j<n-1;j++){
            if(temp>num[j]){
                temp=num[j];
            }
        }
        num[i]=temp;
        temp=num[i+1];
        num[i+1]=num[i];

    }
        return num;
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        System.out.print(Arrays.toString(Selection(num)));
        
    }
    
}
