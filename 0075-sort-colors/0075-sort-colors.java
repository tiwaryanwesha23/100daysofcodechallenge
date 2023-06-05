/*
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
*/


public class Solution {
    public void sortColors(int[] nums) {
        
        int r = 0;
        int w = 0;
        int b = 0;
        for (int num : nums) {
            if (num == 0) {
                nums[b++] = 2;
                nums[w++] = 1;
                nums[r++] = 0;

            } else if (num == 1) {
                nums[b++] = 2;
                nums[w++] = 1;
            } else if (num == 2) {
                b++;
            }
        }
    }
}