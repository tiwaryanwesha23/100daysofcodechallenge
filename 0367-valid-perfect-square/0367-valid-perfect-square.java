class Solution {

    public boolean isPerfectSquare(int n) {
        long sum = 0;
        for (int i = 1; sum < n; i = i + 2) {
            sum = sum + i;
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
}