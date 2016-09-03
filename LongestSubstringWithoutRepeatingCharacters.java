public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        String toCheck = "";
        String result = "";
        List<String> list = new ArrayList<>();
        for (int i=0; i<s.length(); ++i) {
            byte[] arr = new byte[128];
            for (int j=i; j<s.length(); ++j) {
                char ch = s.charAt(j);
                arr[ch] += 1;
                if (arr[ch] > 1) {
                    list.add(result);
                    result = "";
                    break;
                } else {
                    result += ch;
                }
            }
            list.add(result);
            result = "";
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (String a : list) {
            if (max < a.length()) {
                max = a.length();
                ans = a;
            }
        }
        return max;
    }
}