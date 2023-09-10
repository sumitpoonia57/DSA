package Greedy;
import java.util.*;
// write a program to find mincost to break choclate into single peice where each piecce has cost
public class ChocolateProblem {
    public static void main(String[] args) {
        int n=6;
        int m=4;
        Integer vertical[]={2,3,1,4,1}; // n-1
        Integer horizontal[]={4,1,2};// m-1
        // Sort an array in descending order
        Arrays.sort(vertical,Comparator.reverseOrder());
        Arrays.sort(horizontal,Comparator.reverseOrder());
        // pointer to keep track of horizonatal and vertical array and horizontal piecces and vertical peices
        int h=0,v=0;
        int hp=1,vp=1;
        int mincost=0;
        // iterate through both array to find out sequencce of cut that first need to done follwong by differnt cut with finding minimum cost
        while(h<horizontal.length && v<vertical.length){
            // hoirzontal cut will take place
            if(horizontal[h]>vertical[v]){
                hp++;
                mincost+=(horizontal[h]*vp);
                h++;
            }else{
                vp++;
                mincost+=(vertical[v]*hp);
                v++;
            }
        }
        // remaining horizontal cut 
        while(h<horizontal.length){
             mincost+=(horizontal[h]*vp);
             hp++;
             h++;
        }
        // remaining cut of vertical cut
        while(v<vertical.length){
                mincost+=(vertical[v]*hp);
                 vp++;
                v++;
        }
        System.out.println("Min Cost:"+ mincost);
    }
    
}
