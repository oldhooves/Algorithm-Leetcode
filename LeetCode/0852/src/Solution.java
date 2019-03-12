/**
 * 852. 山脉数组的峰顶索引
 * https://leetcode-cn.com/classic/problems/peak-index-in-a-mountain-array/description/
 * Created by 老蹄子 on 2019/3/12 下午9:44
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i + 1 < A.length; i++) {
            if (A[i] > A[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}