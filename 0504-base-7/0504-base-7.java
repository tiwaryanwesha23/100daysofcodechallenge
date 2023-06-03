class Solution {
    public String convertToBase7(int num) {
        if (Math.abs(num) < 7) return Integer.toString(num);
        return convertToBase7(num / 7) + Integer.toString(Math.abs(num % 7));
    }
}