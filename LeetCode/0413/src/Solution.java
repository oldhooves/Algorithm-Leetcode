/**
 * 413. 等差数列划分
 * https://leetcode-cn.com/problems/arithmetic-slices/description/
 * Created by 老蹄子 on 2018/11/9 下午2:47
 */
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        for (int s = 0; s < A.length - 2; s++) {
            int d = A[s + 1] - A[s];
            for (int e = s + 2; e < A.length; e++) {
                int i = 0;
                for (i = s + 1; i <= e; i++) {
                    if (A[i] - A[i - 1] != d) {
                        break;
                    }
                }
                if (i > e) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(new Solution().numberOfArithmeticSlices(A));
    }
}
