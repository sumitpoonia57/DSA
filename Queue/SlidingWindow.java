package Queue;
import java.util.*;
// sliding window Brute Force approach
public class SlidingWindow {
    public static void sliding(int arr[],int k){
        int n=arr.length;
        int max=0;
        for(int i=0;i<=n-k;i++){
            max=arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
        sliding(arr, 3);
    }
    
}
