package Sorting;
// write a program for book allocation
import java.util.*;

public class BookAllocation {

    public  static int minPages(int num[],int k,int minimum,int maxi){
        
        int res=0;
        while(minimum<=maxi){
            int mid=(minimum+maxi)/2;
            if(isFeasable(num,k,mid)){
                res=mid;
                maxi=mid-1;
            }
            else{
                minimum=mid+1;
            }
        }
        return res;
    }
    public static boolean isFeasable(int num[],int k,int mid){
        int student=1;
        int sum=0;
        for(int i=0;i<num.length;i++){
            if((sum+num[i])>mid){
                student++;
                sum=num[i];
            }
            else{
                sum+=num[i];
            }
        }
        return student<=k;

    }

    public static void main(String[] args) {
        int num[]={10,10,20,30};
        int k=2;
        int sum=0;
        int min=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
            min=Math.max(min,num[i]); 
        }
        System.out.println(min);
        System.out.println(sum);
        int allocation=minPages(num, k,min,sum);
        System.out.print(allocation);
        

        
    }
    
}
