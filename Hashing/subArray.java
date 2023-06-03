package Hashing;
// write a program to find start and ending index of array whih contain sum that is given from user input
import java.util.*;

public class subArray {
    public static void SubArray(int num[],int sum){
        int start=0;
        int end= -1;
        int currsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<num.length;i++){
            currsum+=num[i];
            if(currsum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currsum-sum)){
                start=map.get(currsum-sum)+1;
                end=i;
                break;
               
            }
            map.put(currsum,i);
        }
        if(end== -1){
            System.out.print("Not Found");
        }
        else{
            System.out.println(start+" "+end);
        }
    }
    
    
    public static void main(String[] args) {
        int num[]={10,15,-5,15,-10,5};
        int sum=5;
        SubArray(num, sum);
        
    }
    
}
