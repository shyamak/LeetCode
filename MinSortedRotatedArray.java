public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        int min = Integer.MAX_VALUE;    
        for (int i = 0; i < nums.length; ++i) {
            if (min > nums[i])
                min = nums[i];
        }
        return min;
    }
}

//---------------------
//O(logn) solution

public class Solution {
    public int findMin(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    
    public int helper(int[] nums, int start, int end) {
        if (start == end)
            return nums[start];
        if ((end - start) == 1)
            return Math.min(nums[start], nums[end]);
        
        int mid = (start+end)/2;
        if (nums[start] < nums[end])
            return nums[start];
            
        else if (nums[mid] > nums[start])
            return helper(nums, mid, end);
        else
            return helper(nums, start, mid);
    }
}