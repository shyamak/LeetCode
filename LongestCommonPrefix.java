public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";
        if (strs.length == 1)
            return strs[0];
    
        String minStr = strs[0];
        for (String str: strs) {
            if (minStr.length() > str.length()) {
                minStr = str;
            }
        }
        
        for (String str: strs) {
            for (int i=0; i<minStr.length(); ++i) {
                if (str.charAt(i) != minStr.charAt(i)) {
                    minStr = minStr.substring(0,i);
                }
            }
        }
        return minStr;
    }
}