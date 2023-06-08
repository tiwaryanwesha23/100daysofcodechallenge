class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            map.put(nums[i], map.containsKey(nums[i]) ? map.get(nums[i]) + 1: 1);
        }
        int cmp = len / 3;
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : set){
            if(entry.getValue() > cmp)
                result.add(entry.getKey());
        }
        return result;
    }
}