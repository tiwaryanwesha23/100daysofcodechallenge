class Solution {
    public int findComplement(int num) {
         int res = ((Integer.highestOneBit(num)-1)<<1)+1;
        return res^num;
    }
}