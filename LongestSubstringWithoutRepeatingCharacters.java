public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        List<String> list = new ArrayList<>();
        for (int i=0; i<s.length(); ++i) {
            String result = "";
            byte[] arr = new byte[128];
            for (int j=i; j<s.length(); ++j) {
                char ch = s.charAt(j);
                arr[ch] += 1;
                if (arr[ch] > 1) {
                    list.add(result);
                    break;
                } else {
                    result += ch;
                }
            }
            list.add(result);
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (String a : list) {
            if (max < a.length()) {
                max = a.length();
                ans = a; //can be used to print out the actual value, though in this case, it will be the last value with maximum length
            }
        }
        return max;
    }
}