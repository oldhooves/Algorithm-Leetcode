/**
 * 896. 单调数列
 * https://leetcode-cn.com/problems/monotonic-array/description/
 * Created by 老蹄子 on 2018/9/26 下午10:43
 */
class Solution {

    public boolean isMonotonic(int[] A) {

        int len = A.length;
        boolean flag;

        if (A[0] <= A[len-1]){
            flag = true;
        }else {
            flag = false;
        }

        if (flag){
            for (int i = 0; i < len - 1; i++) {
                if (A[i] > A[i+1]){
                    return false;
                }
            }
        }else {
            for (int i = 0; i < len - 1; i++) {
                if (A[i] < A[i+1]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] A = {1,1,1};
        boolean res = new Solution().isMonotonic(A);
        System.out.println(res);
    }
}
