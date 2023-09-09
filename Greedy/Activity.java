package Greedy;
import java.util.*;
// Activity Selection Problem
public class Activity {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxActivity=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxActivity=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxActivity++;
                lastEnd=end[i];
                ans.add(i);
            }
        }
        System.out.println("maxActivity "+maxActivity);
        System.out.print(ans);
        
    }
    
}
