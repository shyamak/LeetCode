//O(n) Run time and O(n) space complexity
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] sum = new int[nums.length];
        int max = nums[0];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }
}
    
//O(1) space complexity
public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < nums.length; ++i) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}