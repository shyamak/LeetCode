public class Solution {

    //O(n) solution
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null || target <= nums[0])
            return 0;
            
        for (int i = 0; i < nums.length-1; ++i) {
            if (nums[i] < target && target <= nums[i+1])
                return i+1;
        }
        return nums.length;
    }

    //Binary Search, O(logn)
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums == null || target <= nums[0])
            return 0;
        
        return searchInsert(nums, target, 0, nums.length-1);
    }
    
    public int searchInsert(int[] nums, int target, int start, int end) {
        int mid = (start+end)/2;
        
        if (target == nums[mid])
            return mid;
        else if (target < nums[mid])
            return start < mid ? searchInsert(nums, target, start, mid-1) : start;
        else
            return end > mid ? searchInsert(nums, target, mid+1, end) : end+1;
    }
}