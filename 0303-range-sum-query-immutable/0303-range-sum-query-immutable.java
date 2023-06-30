class NumArray {
    int[] accum;
    public NumArray(int[] nums) {
        accum = new int[nums.length + 1];
        for (int i = 1; i < accum.length; ++i) {
            accum[i] = accum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return accum[j + 1] - accum[i];
    }
}