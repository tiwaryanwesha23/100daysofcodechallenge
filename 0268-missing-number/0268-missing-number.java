class Solution {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int res = nums.length;
    for (int i = 0; i < nums.length; i++) {
        if (i != nums[i]) {
            res = i;
            break;
        }
    }
    return res;
}
}