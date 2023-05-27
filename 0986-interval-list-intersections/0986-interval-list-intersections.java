class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int len = A.length + B.length;
        int[] starts = new int[len];
        int[] ends = new int[len];
        for(int i = 0; i < A.length; i++){
            starts[i] = A[i][0];
            ends[i] = A[i][1];
        }
        for(int i = A.length; i < A.length + B.length; i++){
            starts[i] = B[i - A.length][0];
            ends[i] = B[i - A.length][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<int[]> res = new ArrayList<>();
        for(int i = 1; i < starts.length; i++){
            if(starts[i] <= ends[i - 1]){
                res.add(new int[]{starts[i], ends[i - 1]});
            }
        }
        int size = res.size();
        int[][] result = new int[size][2];
        for(int i = 0; i < size; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}