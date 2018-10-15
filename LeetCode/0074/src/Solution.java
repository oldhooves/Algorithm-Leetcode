/**
 * 74. 搜索二维矩阵
 * https://leetcode-cn.com/problems/search-a-2d-matrix/description/
 * Created by 老蹄子 on 2018/10/15 下午9:01
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int len = row * col;
        int left = 0;
        int right = len - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int x = matrix[mid / col][mid % col];
            if (x == target){
                return true;
            }else if (x > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
}
