public class Solution {
    public int maxProfit(int[] prices) {
     //two pointers with one looking, and 
     
     //1,12,3,4,7,15,6,22
     
     int profit = 0;
     for (int i=0; i<prices.length-1; ++i) {
        if (prices[i+1] > prices[i]) {
            profit += prices[i+1] - prices[i];
        }
     }
     return profit;
    }
}