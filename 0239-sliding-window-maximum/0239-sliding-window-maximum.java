class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            while(!list.isEmpty() && nums[i] >= nums[list.getLast()]){
                list.pollLast();
            }
            list.add(i);
            if(list.get(0) < i - k + 1)
                list.pollFirst();
            if(i >= k - 1) res[i - k + 1] = nums[list.get(0)];
        }
        return res;
    }
}