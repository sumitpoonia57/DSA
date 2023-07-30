package Stack;
import java.util.*;
// find next greater element of array in new array
public class NextGreater {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int arr[]={5,2,13,3,8};
        int next[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]= -1;
            }
            else{
                next[i]=arr[s.peek()];
               
            }
            s.push(i);
        }
        System.out.println(Arrays.toString(next));  
    }
    
    
}
