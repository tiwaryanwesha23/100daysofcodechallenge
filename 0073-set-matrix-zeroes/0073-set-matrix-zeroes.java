class Solution {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int temp[][]= new int[m][n];
     
     for (int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            temp[i][j]=1;

        }
     } 
    for (int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           if(matrix[i][j]==0){
                    for(int k=0; k<matrix.length; k++){
                         temp[k][j]=0;
                    }
                    for(int l=0; l<matrix[0].length; l++){
                            temp[i][l]=0;    
                    }
                }
            }
    }
            for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j]==0)
                matrix[i][j]=temp[i][j];
        }
            }
    }
}