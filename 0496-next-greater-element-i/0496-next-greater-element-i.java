// stack
class Solution {
    public int[] nextGreaterElement(int[] sub, int[] base) {
        Map<Integer, Integer> baseMap = generateSubMap(base);
        for (int i = 0; i < sub.length; i++) {
            sub[i] = baseMap.getOrDefault(sub[i], -1);
        }
        return sub;
    }
    
    private Map<Integer, Integer> generateSubMap(int[] base) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> baseMap = new HashMap<>();
        for (int num : base) {
            while (!stack.isEmpty() && stack.peek() < num) {
                int pop = stack.pop();
                baseMap.put(pop, num);
            }
            stack.push(num);
        }
        return baseMap;
    }
}