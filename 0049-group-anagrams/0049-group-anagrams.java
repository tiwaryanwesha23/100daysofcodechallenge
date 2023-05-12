public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, LinkedList<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = sort(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        LinkedList<List<String>> res = new LinkedList<>();
        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()) { // note the for loop here
            res.add(entry.getValue());
        }
        return res;
    }
    
    private String sort(String str) { // sort a string
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}