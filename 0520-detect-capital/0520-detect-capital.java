// public class Solution {
//     public boolean detectCapitalUse(String word) {
//         return word.matches("[a-z]+|[A-Z][a-z]*|[A-Z]+");
//     }
// }

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word == null ) return false;
        int len = word.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))) count++;
        }
        if (count == 1) return Character.isUpperCase(word.charAt(0));
        return count == 0 || count == len;
    }
}