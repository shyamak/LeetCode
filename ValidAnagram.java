public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
            
        HashMap <Character, Integer> forStringA = new HashMap<>();
        HashMap <Character, Integer> forStringB = new HashMap<>();       
        
        forStringA = makeMaps(forStringA, s);
        forStringB = makeMaps(forStringB, t);
        
        return forStringA.equals(forStringB);
    }
    
    public static HashMap<Character, Integer> makeMaps(HashMap<Character, Integer> map, String a) {
        for (int i=0; i<a.length(); ++i) {
            if (map.keySet().contains(a.charAt(i)))
                map.put(a.charAt(i), map.get(a.charAt(i))+1);
            else
                map.put(a.charAt(i), 1);
        }
        return map;
    }
}