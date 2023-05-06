package Arrays;

import java.util.*;
// write a program to calculate buy and sell stock problem

public class BuySellStock {
    public static int Stocks(int prices[]) {
        int buyStock = Integer.MAX_VALUE;
        // int sellStock=0;
        int profit = 0;
        int maxProfit = 0;
        for (int i : prices) {
            if (buyStock < i) {
                profit = i - buyStock;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = i;
            }

            // sellStock=prices[i];
            // if(buyStock<prices[i]){
            // buyStock=prices[i];
            // }
            // if(sellStock>buyStock){
            // int MaxProfit=sellStock-buyStock;
            // if(MaxProfit>profit){
            // profit=MaxProfit;
            // }
            // }
            // else{
            // buyStock=sellStock;
            // }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 2 };
        System.out.print(Stocks(prices));

    }

}
