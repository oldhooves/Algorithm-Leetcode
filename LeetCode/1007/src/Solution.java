/**
 * 1007. 行相等的最少多米诺旋转
 * https://leetcode-cn.com/classic/problems/minimum-domino-rotations-for-equal-row/description/
 * Created by 老蹄子 on 2019/3/21 下午8:04
 */
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if (A.length != B.length) {
            return -1;
        }
        int[] countA = new int[7];
        int[] countB = new int[7];
        int[] same = new int[7];
        for (int i = 0; i < A.length; i++) {
            ++countA[A[i]];
            ++countB[B[i]];
            if (A[i] == B[i]) {
                ++same[A[i]];
            }
        }
        for (int i = 1; i < 7; i++) {
            if (countA[i] + countB[i] - same[i] >= A.length) {
                return Math.min(countA[i],countB[i]) - same[i];
            }
        }
        return -1;
    }
}