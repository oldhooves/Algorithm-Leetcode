/**
 * 775. 全局倒置与局部倒置
 * https://leetcode-cn.com/problems/global-and-local-inversions/description/
 * Created by 老蹄子 on 2018/10/14 下午1:42
 */
class Solution {
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] - i > 1 || A[i] - i < -1)
                return false;
        }
        return true;
    }
}
