//O(n^2)  O(n^2)
public class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i = 0;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(p.charAt(j-1)!='*'){
                    dp[i][j] = i>0 && dp[i-1][j-1] && (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'); 
                }else {
                    dp[i][j] = dp[i][j-1] || i>0 && dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}