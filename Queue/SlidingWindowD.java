package Queue;
// Sliding Window Maximum using Deque 
import java.util.*;

public class SlidingWindowD {
    public static void sliding(int arr[],int k){
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        int n=arr.length;
        // first window
        int i;
        for(i=0;i<k;i++){
            dq.add(i);
            // remove useless element from deque
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(i);
        // now for remaining element
        for(;i<n;i++){
            // print maximum element of previous window
            System.out.print(arr[dq.peek()]+" ");
          // remove the element which are out of this window
          while(!dq.isEmpty() && dq.peek()<=i-k){
            dq.removeFirst();
          }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        // print last window of array
        System.out.print(arr[dq.peek()]);

    }
    public static void main(String[] args) {
        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
           sliding(arr, 3);
        
    }
    
}
