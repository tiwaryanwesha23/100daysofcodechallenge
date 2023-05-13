class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int i = 0;
        for(i = 0; i < nums1.length; i++)
            merge[i] = nums1[i];
        for(; i - nums1.length < nums2.length; i++)
            merge[i] = nums2[i - nums1.length];
        Arrays.sort(merge);
        return (merge.length) % 2 != 0 ? 
            (double)merge[merge.length / 2] : (double)(merge[merge.length / 2] + merge[merge.length / 2 - 1]) / 2;
    }
}