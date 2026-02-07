class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat[0].length;
        int sum =0;
        //left diagonal 
        for(int i =0;i<row;i++){
            sum+=mat[i][i];
        }
        //right diagonal
        int left = row-1;
        for(int i =0;i<row;i++){
            sum += mat[i][left--];
        }
        return (row%2 != 0)? sum-=mat[row/2][row/2]:sum;

        
    }
}