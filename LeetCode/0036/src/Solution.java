import java.util.HashSet;
import java.util.Set;

/**
 * 36. 有效的数独
 * https://leetcode-cn.com/problems/valid-sudoku/description/
 * Created by 老蹄子 on 2018/11/21 下午8:54
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i / 3 + b + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
