class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) return 0;
        int res = 0;
        int[] count = new int[26];
        int maxCount = 0;
        for (int i = 0, j = 0; j < s.length(); ++j) {
            maxCount = Math.max(maxCount, ++count[s.charAt(j) - 'A']);
            while (j - i + 1 - maxCount > k) {
                count[s.charAt(i++) - 'A']--;
            }
            res = Math.max(j - i + 1, res);
        }
        return res;
    }
}