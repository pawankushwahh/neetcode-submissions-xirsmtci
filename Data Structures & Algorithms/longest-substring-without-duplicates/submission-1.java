public class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int re = 0;
        int n = s.length(); 

        for (int r = 0; r < n; r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            re = Math.max(re, r - l + 1);
        }
        return re;
    }
}