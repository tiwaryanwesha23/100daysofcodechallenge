class Solution {
    public int maxProfit(int[] prices) {
        //In constraints it is given that 
        //0 <= prices[i] <= 104
        int min = 10000;
        //Profit will be 0, if no transaction are done.
        int maxDiff = 0;
        int size = prices.length;
        for (int i = 0; i < size; i++){
            //We need to find Min value
            min = Math.min(prices[i], min);
            //We need to find maxProfit which is Difference between 
            //currentPrice - min, then compare with maxDiff
            maxDiff = Math.max(prices[i] - min, maxDiff);
         }
        return maxDiff;
    }
}