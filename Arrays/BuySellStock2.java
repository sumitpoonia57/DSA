package Arrays;
// write a program to calculate buy sell stock2 problem where you caan buy as asmany stocks and sell as any many time  but you cannot buy consecutively two stock

public class BuySellStock2 {
    public static int buyStock(int num[]) {
        int profit=0;
        for(int i=1;i<num.length;i++){
            if(num[i]>num[i-1]){
                profit+=(num[i]-num[i-1]);

            }

        }
        return profit;

    }

    public static void main(String[] args) {
        int num[] = { 5, 2, 7, 3, 6, 1, 2, 4 };
        System.out.print(buyStock(num));
    }

}
