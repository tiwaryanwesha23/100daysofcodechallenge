class Solution {
    public List<Integer> grayCode(int n) {
        if(n == 0) {
            List<Integer> ans = new ArrayList<>();
            ans.add(0);
            return ans;
        }
        
        List<Integer> ans = grayCode(n - 1);
        int base = 1 << (n - 1);
        int size = ans.size();
        for(int i = size - 1; i >= 0; i--) {
            ans.add(base + ans.get(i));  
        }
        
        return ans;
    }
}