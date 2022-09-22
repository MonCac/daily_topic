package leetbooks.primary_algorithms;

// 有效的数独

public class No_01_010 {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] ans = new int[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                int curNumber = board[i][j] - '1';
                if(row[i][curNumber] == 1)
                    return false;
                if(col[j][curNumber] == 1)
                    return false;
                if(ans[i / 3 + j / 3 * 3][curNumber] == 1)
                    return false;
                row[i][curNumber] = 1;
                col[j][curNumber] = 1;
                ans[i / 3 + j / 3 * 3][curNumber] = 1;
            }
        }
        return true;
    }
}
