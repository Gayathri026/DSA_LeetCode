class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = 0, rookCol = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                }
            }
        }
        int count = 0;
        // Directions → up, down, left, right
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int[] d : dir) {
            int r = rookRow + d[0];
            int c = rookCol + d[1];

            while(r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
                if(board[r][c] == 'B') break;
                if(board[r][c] == 'p') {
                    count++;
                    break;
                }
                r += d[0];
                c += d[1];
            }
        }

        return count;
    }
}
