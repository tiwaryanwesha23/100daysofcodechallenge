public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};
        int sum = 0;
        sum += map.get(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            sum += map.get(s.charAt(i));
            if(map.get(s.charAt(i)) > map.get(s.charAt(i - 1)))
                sum -= map.get(s.charAt(i - 1)) * 2;
        }
        return sum;
    }
}