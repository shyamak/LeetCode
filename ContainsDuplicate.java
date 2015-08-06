public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;
        
        HashSet<Integer> set = new HashSet<Integer>();
        for (int a: nums) {
            if (!set.add(a))
                return true;
        }
        return false;
    }
}