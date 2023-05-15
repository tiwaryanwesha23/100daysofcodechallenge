class Solution {
    public int[] countBits(int num) {
        
    int[] res = new int[num + 1];
    for(int i = 1; i <= num; i++){
        res[i] = res[i & (i - 1)] + 1;
    }
    return res;
}
int bitCount(int i) {
    i = i - ((i >>> 1) & 0x55555555);
    i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
    i = (i + (i >>> 4)) & 0x0f0f0f0f;
    i = i + (i >>> 8);
    i = i + (i >>> 16);
    return i & 0x3f;
}
}