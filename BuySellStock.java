public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices == null)
            return 0;
            
        int maxDiff = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; ++i) {
            min = Math.min(min, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i]-min);
        }   
        return maxDiff;
    }
}