package Greedy;
import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        Integer currency[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(currency,Comparator.reverseOrder());
        int amount=590;
        int count=0;
        ArrayList<Integer> currencyused=new ArrayList<>();
        for(int i=0;i<currency.length;i++){
            if(currency[i]<=amount){
                while(currency[i]<=amount){
                     amount=amount-currency[i];
                    count++;
                    currencyused.add(currency[i]);
                }
            }
           
        }
        System.out.println("Minimum Value Used:"+count);
        System.out.print(currencyused);
    }
    
}
