class Solution {
    public int countSegments(String s) {
        int length = s.length();
        char[] chs = s.toCharArray();
        int res = 0;
        
        for (int i = 0; i < length; i++) {
            if (chs[i] != ' ' && (i == 0 || chs[i - 1] == ' ')) {
                res++;
            }   
        }
        
        return res;
    }
}