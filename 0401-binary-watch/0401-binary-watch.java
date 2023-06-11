public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
     
        for(int i=0; i<12; i++){
            for(int j=0; j<60; j++){
                int total = countDigits(i)+countDigits(j);
                if(total==num){
                    String s="";
                    s+=i+":";
     
                    if(j<10){
                        s+="0"+j;
                    }else{
                        s+=j;
                    }
     
                    result.add(s);
                }
            }
        }
 
        return result;
    }
     
    public int countDigits(int num){
        int result=0;
     
        while(num>0){
            if((num&1)==1){
                result++;
            }
     
            num>>=1;
        }
     
        return result;
    }
}