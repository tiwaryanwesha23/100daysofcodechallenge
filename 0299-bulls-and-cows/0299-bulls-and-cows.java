class Solution {
    public String getHint(String secret, String guess) {
        if (secret == null || guess == null || secret.length() == 0 || guess.length() == 0) {
            return "0A0B";
        }
        
        int[] nums = new int[10]; // 0 - 9
        int bulls = 0, cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g) {
                bulls++;
            } else {
                if (nums[s] < 0) cows++;
                if (nums[g] > 0) cows++;
                nums[s]++;
                nums[g]--;
            }
        }

        return String.format("%sA%sB", bulls, cows);
    }
}