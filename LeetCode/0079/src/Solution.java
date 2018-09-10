/**
 * 79. 单词搜索
 * https://leetcode-cn.com/problems/word-search/description/
 * Created by 老蹄子 on 2018/9/10 下午10:11
 */
class Solution {

    private int d[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    private int m,n;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {

        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (searchWord(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean inArea(int x,int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    private boolean searchWord(char[][] board, String word, int index,
                               int startX, int startY) {

        if (index == word.length() - 1){
            return board[startX][startY] == word.charAt(index);
        }

        if (board[startX][startY] == word.charAt(index)){
            visited[startX][startY] = true;
            for (int i = 0; i < 4; i++) {
                int newX = startX + d[i][0];
                int newY = startY + d[i][1];
                if (inArea(newX,newY) && !visited[newX][newY] && searchWord(board,word,index+1,newX,newY)){
                    return true;
                }
            }
            visited[startX][startY] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] b1 = { {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        String words[] = {"ABCCED", "SEE", "ABCB" };
        for(int i = 0 ; i < words.length ; i ++)
            if((new Solution()).exist(b1, words[i]))
                System.out.println("found " + words[i]);
            else
                System.out.println("can not found " + words[i]);

    }
}
