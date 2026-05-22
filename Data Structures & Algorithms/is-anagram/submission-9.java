class Solution {
    public boolean isAnagram(String s, String t) {
        // converty Str to arrays 
        // check equality using equals to 
        // and then return true or false 

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray(); 

        Arrays.sort(s1);
        Arrays.sort(t1);

        if (Arrays.equals(s1,t1)){
            return true ; 
        }
        else {
            return false ; 
        }
    }
}
