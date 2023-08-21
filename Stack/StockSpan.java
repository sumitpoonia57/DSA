package Stack;
import java.util.*;
// Stock Span Problem
public class StockSpan {
    public  static void stockSpan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currhigh=stock[i];
            while(!s.isEmpty() &&  currhigh>=stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
               int prevhigh=s.peek();
               span[i]=i-prevhigh;
            }
            s.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock, span);
    }
}
