package Stack;
import java.util.*;

public class MaxArea {
    // write a program to calculate Max area of Histogram
    public static void maxArea(int arr[]){
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        // calculate next Smallest from right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]= arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // Caalculate next smalest from left
         s=new Stack<>(); // it will empty the stack
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // calculate area
        int maxarea=0;
        for(int i=0;i<arr.length;i++){
            int width=nsr[i]-nsl[i]-1;
            int height=arr[i];
            int currarea=height*width;
              System.out.println("currarea"+currarea);
            maxarea=Math.max(currarea,maxarea);
        }
        System.out.println(maxarea);
        System.out.println(Arrays.toString(nsl));
        System.out.println(Arrays.toString(nsr));
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
    
}
