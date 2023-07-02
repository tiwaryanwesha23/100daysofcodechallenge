class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> rst = new ArrayList<>();
        int minSum = Integer.MAX_VALUE, sum;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                sum = i + map.get(list2[i]);
                if (sum < minSum) {
                    rst.clear();
                    rst.add(list2[i]);
                    minSum = sum;
                } else if (sum == minSum) {
                    rst.add(list2[i]);
                }
            }
        }
        return rst.toArray(new String[rst.size()]);
    }
}