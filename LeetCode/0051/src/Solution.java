import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 51. N皇后
 * https://leetcode-cn.com/problems/n-queens/description/
 * Created by 老蹄子 on 2018/9/11 下午7:55
 */
class Solution {

    private boolean[] col;
    private boolean[] dial1;
    private boolean[] dial2;
    private ArrayList<List<String>> res;

    public List<List<String>> solveNQueens(int n) {

        res = new ArrayList<>();
        col = new boolean[n];
        dial1 = new boolean[2 * n - 1];
        dial2 = new boolean[2 * n - 1];

        LinkedList<Integer> row = new LinkedList<>();
        putQueen(n,0,row);

        return res;
    }

    private void putQueen(int n,int index,LinkedList<Integer> row){

        if (index == n){
            res.add(generateBoard(n,row));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!col[i] && !dial1[index + i] && !dial2[index - i + n -1]){
                row.addLast(i);
                col[i] = true;
                dial1[index + i] = true;
                dial2[index - i + n -1] = true;
                putQueen(n, index + 1, row);
                col[i] = false;
                dial1[index + i] = false;
                dial2[index - i + n -1] = false;
                row.removeLast();
            }
        }

        return;
    }

    private List<String> generateBoard(int n, LinkedList<Integer> row){

        assert row.size() == n;

        ArrayList<String> board = new ArrayList<String>();
        for(int i = 0 ; i < n ; i ++){
            char[] charArray = new char[n];
            Arrays.fill(charArray, '.');
            charArray[row.get(i)] = 'Q';
            board.add(new String(charArray));
        }
        return board;
    }

    private static void printBoard(List<String> board){
        for(String s: board)
            System.out.println(s);
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 4;
        List<List<String>> res = (new Solution()).solveNQueens(n);
        for(List<String> board: res)
            printBoard(board);
    }

}
