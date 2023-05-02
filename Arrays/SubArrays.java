package Arrays;
// write a program to print subarrays for arrays
import java.util.*;
public class SubArrays {
    public static void subArrays(int num[]){

       
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int sum=0;
                System.out.print("");
                for(int k=i;k<j;k++){
                    int remain=num[k];
                    sum+=remain;
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                    System.out.print(remain+" ");
                
                }
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum:"+max);
        System.out.println("Minimum Sum:"+min);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12};
         subArrays(num);
    }
    
}
