class Solution {
    public void nextPermutation(int[] nums) {
        if( nums == null || nums.length <= 1 )
            return;
        int l = nums.length;  
        int i = l-2;
        while( i >= 0){
            if( nums[i] < nums[i+1] )
                break;
            i-- ;
        }
        if( i >= 0){
            int j = l-1;
            while( j > i){
                if( nums[j] > nums[i] )
                    break;
                j-- ;
            } 
            swap( nums, i, j);
        }
        reverseOrder(nums, i+1);
    }
    private void swap( int[] nums, int i, int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverseOrder( int[] nums, int i ){ // i is the starting index need to be handle
        int l = nums.length;
        int mid = i+(l-1-i)/2;
        for( int k = i; k <= mid; k++ ){
            int temp = nums[k];
            nums[k] = nums[l-1+i-k];
            nums[l-1+i-k] = temp;
        }
    }
}