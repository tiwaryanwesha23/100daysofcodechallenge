class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int len_points = points.length;
        int[] sorted_points = new int[len_points];
        int[][] ans = new int[K][2];
        
        for (int i = 0; i < len_points; ++i) {
            sorted_points[i] = dist(points[i]);
        }
        
        Arrays.sort(sorted_points);
        
        int marker = sorted_points[K - 1];
        int t = 0;
        
        for (int j = 0; j < len_points; ++j) {
            if (dist(points[j]) <= marker) {
                ans[t++] = points[j];
            }
        }
        return ans;
    }
    
    public int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}