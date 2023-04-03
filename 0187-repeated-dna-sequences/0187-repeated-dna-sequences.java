class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<Integer> set = new HashSet<Integer>();
        Set<String> res = new HashSet<String>();
        
        char[] map = new char[26];
        int len = s.length();
        map['A' - 'A'] = 0; // A = 00
        map['C' - 'A'] = 1; // B = 01
        map['G' - 'A'] = 2; // C = 10
        map['T' - 'A'] = 3; // D = 11
        
        for(int i=0; i<= len - 10; i++)
        {
            int sequence = 0;
            for(int j=i; j< i+10; j++)
            {
                
                sequence = sequence << 2;
               
                sequence = sequence | map[s.charAt(j) - 'A'];
            }
            if( set.contains(sequence) )
                res.add(s.substring(i, i+10));
            else
                set.add(sequence);
        }
        
        return new ArrayList(res);
    }
}