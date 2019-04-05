/**
 * 922. 按奇偶排序数组 II
 * https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 * Created by 老蹄子 on 2019/4/5 下午2:47
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2) {
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1) {
                    j += 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}