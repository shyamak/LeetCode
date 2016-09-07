public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";
        
        //get all substring
        //check if they are palindrome
        //calculate the length
        //return the string
        String result = s.substring(0,1);
        for (int i=0; i<s.length(); ++i) {
            String substr = getPalindrome(s,i,i);
            if (result.length() < substr.length()) {
                result = substr;
            }
            substr = getPalindrome(s,i,i+1);
            if (result.length() < substr.length()) {
                result = substr;
            }
        }
        return result;
    }
    
    public String getPalindrome(String a, int start, int end) {
        while (start>=0 && end<=a.length()-1 && a.charAt(start) == a.charAt(end)) {
            --start;
            ++end;
        }
        return a.substring(start+1,end);
    }
}