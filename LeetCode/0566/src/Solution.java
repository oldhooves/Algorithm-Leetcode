import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 566. 重塑矩阵
 * https://leetcode-cn.com/problems/reshape-the-matrix/description/
 * Created by 老蹄子 on 2018/9/25 下午9:50
 */
class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        if (nums.length == 0){
            return nums;
        }

        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c){
            return nums;
        }

        Queue<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(nums[i][j]);
            }
        }

        int[][] res = new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = list.poll();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int[][] res = new Solution().matrixReshape(nums,1,4);
        for (int i = 0; i <res.length ; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.println(res[i][j]);
            }
        }
    }
}
