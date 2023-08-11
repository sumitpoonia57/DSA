package Queue;
// sliding window maximum using priority queue
import java.util.*;

public class SlidingWindowP {
    public static ArrayList<Integer> sliding(int arr[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder(null));
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        int i=0;
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        // find first highest element in  window size k
        result.add(pq.peek());
        // remove first element  from priority queue so that window can move
        pq.remove(arr[0]);
        //Important Note:-System.out.println(i);
        // iterate for next element 
        for(;i<n;i++){
            // adding new element in the window
            pq.add(arr[i]);
            // find max element in the current sliding window
            result.add(pq.peek());
            // removing the first element from front end of queue
            pq.remove(arr[i-k+1]); 
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
        System.out.println(sliding(arr, 3));
        
    }
    
}
