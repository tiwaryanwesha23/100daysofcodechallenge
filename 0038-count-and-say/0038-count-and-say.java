class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        else{
            String last = countAndSay(n - 1);
            char[] arr = last.toCharArray();
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] == arr[i - 1]) count++;
                else{
                    sb.append(new Integer(count).toString());
                    sb.append(arr[i - 1]);
                    count = 1;
                }
            }
            sb.append(new Integer(count).toString());
            sb.append(arr[arr.length - 1]);
            return sb.toString();
        }
    }
}