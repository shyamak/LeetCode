public class Solution {
    public int maxProfit(int[] prices) {
     //two pointers with one looking, and 
     
     //1,12,3,4,7,15,6,22
     
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     int profit = 0;
     for (int i=0; i<prices.length-1; ++i) {
        if (min > prices[i])
            min = prices[i];
        if (max < prices[i+1])
            max = prices[i+1];
        if (max > min) {
            profit += max-min;
        }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
     }
     return profit;
    }
}