package Arrays;

import java.util.*;
// write a program to calculate buy and sell stock problem

public class BuySellStock {
    public static int Stocks(int prices[]) {
        int buyStock = Integer.MAX_VALUE;
        // int sellStock=0;
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyStock<prices[i]){
                profit=prices[i]-buyStock;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyStock=prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = { 1,7, 5, 3, 6, 2 };
        System.out.print(Stocks(prices));

    }

}
