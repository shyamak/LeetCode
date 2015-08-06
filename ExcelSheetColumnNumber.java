public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        int i = s.length()-1;
        int t = 0;
        while (i >= 0) {
            char temp = s.charAt(i);
            num += Math.pow(26,t) * (temp - 64);
            --i;
            t++;
        }
        return num;
    }
}