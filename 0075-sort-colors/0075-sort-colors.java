class Solution {
  public void sortColors(int[] nums) {
    int zero = 0;
    int second = nums.length - 1;

    for (int i = zero; i <= second; i++) {
      while (nums[i] == 2 && i < second) {
        swap(nums, i, second--);
      }
      while (nums[i] == 0 && i > zero) {
        swap(nums, i, zero++);
      }
    }
  }

  public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}