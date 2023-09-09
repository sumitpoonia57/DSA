package Greedy;
// write a program to find lonest chain which form from given set f pairs
import java.util.*;
import java.util.Comparator;

public class MaxLen {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        // sort array on the basis of 2nd number
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        for(int[]i:pairs){
            System.out.print(Arrays.toString(i)+" ");
            System.out.println();
        }
        // take 1st pair as part of longest chain
        int chain=1;
        int lastcchainend=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=lastcchainend){
                chain++;
                lastcchainend=pairs[i][1];
            }
        }
        System.out.println("longest Chain "+chain);
    }
}
