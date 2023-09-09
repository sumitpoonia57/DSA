package Greedy;
// write a program to solve program of Fractional KnapSack
import java.util.*;

public class KnapSack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int W=50;
        // calculate ratio of weight/value
        double[][] ratio=new double[value.length][2];
        // 0th col:- indx 1stCol:- represent ratio
        for(int i=0;i<value.length;i++){

            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        } 
        int capacity=W;
        int finalValue=0;
        // Sort the 2D array on the basis of ratio using lambda Expression
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        // array is sort in ascending order
       for(int i=ratio.length-1;i>=0;i--){
        int indx=(int)ratio[i][0];
        if(capacity>=weight[indx]){
            capacity=capacity-weight[indx];
            finalValue+=value[indx];
        }else{
            finalValue+= (ratio[i][1]*capacity);
            capacity=0;
            break;
        }
        }
        System.out.println(finalValue);
       }
    }
