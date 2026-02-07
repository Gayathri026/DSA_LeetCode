class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix[0].length;
        for(int i=1;i<matrix.length;i++){
            for(int j =1;j<n;j++){
                if(matrix[i-1][j-1] != matrix[i][j])return false;
            }
        }
        return true;
    }
}