package Queue;
import java.util.*;
// write a program to connect N Ropes with minimum cost
public class priorityQueue {
    public static void minCost(int a[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans=0;
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int sum=first+second;
            ans+=sum;
            pq.add(sum);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int a[]={2,5,4,8,6,9};
        minCost(a);
    } 
}
