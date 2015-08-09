public class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length<2){
            return;
        }
 
        int[] count = new int[3];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
 
        int j = 0;
        int k = 0;
        while(j<=2){
            if(count[j]!=0){
                nums[k++]=j;
                count[j] = count[j]-1;
            }else{
                j++;
            }
        }
    }
}