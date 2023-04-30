class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = grid[i][j]; // Initialize
                if (i == 0 && j == 0) continue; // skip starting point
                // Calculate DP
                int fromUp = i == 0 ? Integer.MAX_VALUE : dp[i - 1][j];
                int fromLeft = j == 0 ? Integer.MAX_VALUE : dp[i][j - 1];
                dp[i][j] += Math.min(fromUp, fromLeft);
                
            }
        }
        
        return dp[m - 1][n - 1];
    }
}
