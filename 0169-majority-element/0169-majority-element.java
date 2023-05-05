class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate =0;
        for (int num : nums){
            if(count==0){
                candidate = num;
                
            }
            if(num==candidate) count +=1;
            else count -= 1;
        }
        return candidate;
    }
}





























/* class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        
        int halfLen = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > halfLen) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
*/