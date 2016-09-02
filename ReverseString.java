public class Solution {
    public String reverseString(String s) {
        char[] strChar = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i=strChar.length-1; i>=0; --i) {
            result.append(strChar[i]);
        }
        return new String(result);
    }
}