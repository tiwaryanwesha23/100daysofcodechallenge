public class Solution {
    public int longestPalindrome(String s) {
        Set<Character> trace = new HashSet<Character>();
        
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            char cc = s.charAt(i);
            if( trace.contains(cc) ) {
                trace.remove(cc);
                ans += 2;
            }
            else
                trace.add(cc);
        }
        return (trace.isEmpty()) ? ans: ans+1;
    }
}