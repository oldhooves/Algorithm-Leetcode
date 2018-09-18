import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * https://leetcode-cn.com/problems/spiral-matrix/description/
 * Created by 老蹄子 on 2018/9/18 下午7:43
 */
class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        if (matrix.length == 0){
            return list;
        }

        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while(tR <= dR && tC <= dC){
            list =  printEdge(matrix,tR++,tC++,dR--,dC--,list);
        }
        return list;
    }

    public ArrayList<Integer> printEdge(int[][] m, int tR, int tC, int dR, int dC, ArrayList<Integer> res){

        if (tR == dR){
            for (int i = tC; i <= dC; i++) {
                res.add(m[tR][i]);
            }
        }
        else if (tC == dC){
            for (int i = tR; i <= dR; i++) {
                res.add(m[i][tC]);
            }
        }
        else {
            int curR = tR;
            int curC = tC;
            while (curC != dC){
                res.add(m[tR][curC]);
                curC++;
            }
            while (curR != dR){
                res.add(m[curR][dC]);
                curR++;
            }
            while (curC != tC){
                res.add(m[dR][curC]);
                curC--;
            }
            while (curR != tR){
                res.add(m[curR][tC]);
                curR--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9 }};
        int[][] matrix2 = {{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12 }};
        List<Integer> result = (new Solution()).spiralOrder(matrix2);
        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }
}
