class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String news1 = "";
        String news2 = "";

        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                char c = Character.toLowerCase(s.charAt(i));

                news1 = news1.concat(String.valueOf(c));
                news2 = c + news2;   // prepend → builds reverse
                // news2 = String.valueOf(s.charAt(i)).concat(news2)    ;   // single character string, say "c"
            // add old string after it

            }
        }
        return news1.equals(news2);
    }
}
