class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        return intersection(set1, set2);
    }
    public int[] intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] ans = new int[set1.size()];
        int i = 0;
        
        for (int num : set1) {
            if (set2.contains(num)) {
                ans[i++] = num;
            }
        }
        return Arrays.copyOf(ans, i);
    }
}