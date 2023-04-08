/*class Solution{
    public void sortColors(int[] nums){
        int lo =0;
        int hi = nums.length -1;
        int mid = 0;
        int temp;
        while(mid <=hi){
            switch (nums[mid]) {
                case 0: {
                    temp= nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                    case1:{
                    mid++;
                    break;
                    }
                case 2:{
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
*/





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
