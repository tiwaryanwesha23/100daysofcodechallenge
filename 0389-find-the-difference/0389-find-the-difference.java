public class Solution {
    public char findTheDifference(String s, String t) {
        int code = t.charAt(s.length());
        
        for(int i =0; i < s.length(); i++){
            code -= (int)s.charAt(i);
            code += (int)t.charAt(i);
        }
        //System.out.println(code);
        return (char)code;
    }
}