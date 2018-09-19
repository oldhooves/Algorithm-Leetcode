/**
 * 48. 旋转图像
 * https://leetcode-cn.com/problems/rotate-image/description/
 * Created by 老蹄子 on 2018/9/19 下午7:50
 */
class Solution {

    public void rotate(int[][] matrix) {

        if (matrix.length == 0){
            return;
        }
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR < dR){
            rotateEdge(matrix,tR++,tC++,dR--,dC--);
        }
    }

    public void rotateEdge(int[][] m,int tR,int tC,int dR,int dC){
        int times = dC - tC;
        int tmp = 0;
        for (int i = 0; i != times; i++) {
            tmp = m[tR][tC + i];
            m[tR][tC + i] = m[dR - i][tC];
            m[dR - i][tC] = m[dR][dC - i];
            m[dR][dC - i] = m[tR + i][dC];
            m[tR + i][dC] = tmp;
        }
    }
}
