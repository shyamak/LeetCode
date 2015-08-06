public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i], 1);
        }
        
        int result= 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() != 2)
                result = e.getKey();
        }
        return result;
    }
}