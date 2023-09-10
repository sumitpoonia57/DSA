package Greedy;
import java.util.*;

public class JobScheduling {
    static class Job{

        int id;
        int deadline;
        int profit;
        public Job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        int job[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job>sequence=new ArrayList<>();
        for(int i=0;i<job.length;i++){
            sequence.add(new Job(i,job[i][0],job[i][1]));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int time=0;
        int maxprofit=0;
        // Sort ArrayList on the basis of profit in descending order
        Collections.sort(sequence,(a,b)->b.profit-a.profit);
        for(int i=0;i<job.length;i++){
            if(sequence.get(i).deadline>time){
                ans.add(sequence.get(i).id);
                time++;
                maxprofit+=sequence.get(i).profit;
            }
        }
        System.out.println(ans);
        System.out.println("MaxProfit "+maxprofit);
    }
    
}
