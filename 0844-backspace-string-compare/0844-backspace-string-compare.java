class Solution {
    public boolean backspaceCompare(String S, String T) {
    LinkedList<Character> listS = new LinkedList<>();
    LinkedList<Character> listT = new LinkedList<>();
    update(S, listS);
    update(T, listT);
    if(listS.size() != listT.size()) return false;
    while(!listS.isEmpty()){
        if(listS.removeLast() != listT.removeLast()) return false;
    }
    return true;
}

void update(String s, LinkedList<Character> list){
    for(char c : s.toCharArray()){
        if(c == '#'){
            if(!list.isEmpty()) list.removeLast();
        } else list.add(c);
    }
}
}

/*
class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}

*/