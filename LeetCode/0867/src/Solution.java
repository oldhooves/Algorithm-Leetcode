/**
 * 867. 转置矩阵
 * https://leetcode-cn.com/problems/transpose-matrix/description/
 * Created by 老蹄子 on 2018/9/21 下午9:59
 */
class Solution {

    public int[][] transpose(int[][] A) {


        int m = A.length;
        int n = A[0].length;
        int[][] res = new int[n][m];


        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res = new Solution().transpose(A);
        for (int i = 0; i <res.length ; i++) {
            for (int j = 0; j <res[0].length ; j++) {
                System.out.println(res[i][j]);
            }
        }
    }
}
