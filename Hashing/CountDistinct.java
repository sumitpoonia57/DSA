package Hashing;
import java.util.*;

class CountDistinct{
static int windows(int arr[], int num,int k)
{
    int count = 0;
    // traversing one window

    for (int i = num; i <num+k; i++) {
       
        int j;
        for ( j = num; j <num+k; j++){
            if (arr[i] == arr[j])
            break;

        }  
       if (j == i){
        count++;
       }     
    }
    return count;
}
// calculating total number of windows
static void countDistinct(int arr[], int n, int k)
{
    for (int i = 0; i <= n - k; i++){
        System.out.print(windows(arr,i, k)+" ");
    }     
}
public static void main(String args[])
{
    int arr[] = { 1, 2, 1, 3, 4, 2, 3 }, k = 4;
    int n = arr.length;
    countDistinct(arr, n, k);
    
}
}