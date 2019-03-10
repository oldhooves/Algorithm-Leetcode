/**
 * 130. 被围绕的区域
 * https://leetcode-cn.com/classic/problems/surrounded-regions/description/
 * Created by 老蹄子 on 2019/3/10 下午2:53
 */
class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        if (board.length < 2 || board[0].length < 2) {
            return;
        }
        int n = board.length,m = board[0].length;
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                dfs(board,i,0);
            }
            if (board[i][m - 1] == 'O') {
                dfs(board,i,m - 1);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                dfs(board,0,i);
            }
            if (board[n - 1][i] == 'O') {
                dfs(board,n - 1,i);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1) {
            return;
        }
        if (board[i][j] == 'O') {
            board[i][j] = '*';
        }
        if (i > 1 && board[i - 1][j] == 'O') {
            dfs(board, i - 1, j);
        }
        if (i < board.length - 2 && board[i + 1][j] == 'O') {
            dfs(board,i + 1,j);
        }
        if (j > 1 && board[i][j - 1] == 'O') {
            dfs(board, i,j - 1);
        }
        if (j < board[i].length - 2 && board[i][j + 1] == 'O') {
            dfs(board,i,j + 1);
        }
    }
}