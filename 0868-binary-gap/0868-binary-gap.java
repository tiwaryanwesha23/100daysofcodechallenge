class Solution {
    public int binaryGap(int N) {
        int gap=0;
        int prev=-1;
        for(int i=0;i<32;i++)
        {
            if((N&(1<<i))!=0)
            {
                if(prev>=0)
                {
                    gap=Math.max(gap,i-prev);
                }
                prev=i;
            }
        }
        return gap;
    }
}