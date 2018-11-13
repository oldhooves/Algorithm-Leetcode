/**
 * 396. 旋转函数
 * https://leetcode-cn.com/problems/rotate-function/description/
 * Created by 老蹄子 on 2018/11/13 下午2:42
 */
class Solution {
    public int maxRotateFunction(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int sum = 0;
        int iteration = 0;
        int len = A.length;

        for (int i = 0; i < len; i++) {
            sum += A[i];
            iteration += (i * A[i]);
        }

        int max = iteration;
        for (int j = len - 1; j >= 0; j--) {
            iteration = iteration + sum - A[j] * len;
            max = Math.max(max,iteration);
        }
        return max;
    }
}
