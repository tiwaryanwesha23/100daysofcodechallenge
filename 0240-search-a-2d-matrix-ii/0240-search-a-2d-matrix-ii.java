class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int rowMax = matrix.length - 1;
    int colMax = matrix[0].length - 1;
    int rowCur = 0;
    int colCur = colMax;

    while (rowCur <= rowMax && colCur >= 0) {
      if (matrix[rowCur][colCur] == target) {
        return true;
      } else if (matrix[rowCur][colCur] > target) {
        colCur--;
      } else {
        rowCur++;
      }
    }

    return false;
  }
}