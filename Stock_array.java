//import java.util.*;
public class Stock_array {
    public static int buyandsellstock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i =0; i< prices.length; i++){
            if(buyprice < prices[i]){  // profit wala case     prices[i] is todays price / selling price
                int profit = prices[i]-buyprice; // today's profit
                maxprofit = Math.max(maxprofit, profit);   // global profit
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};                  // O(n)
       System.out.println( buyandsellstock(prices));
    }
}
