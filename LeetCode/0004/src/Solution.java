/**
 * 4. 寻找两个有序数组的中位数
 * https://leetcode-cn.com/classic/problems/median-of-two-sorted-arrays/description/
 * Created by 老蹄子 on 2019/3/13 下午8:18
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length,n = nums2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getKth(nums1, 0, nums2, 0, l) + getKth(nums1, 0, nums2, 0, r)) / 2.0;

    }

    private double getKth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart > A.length - 1) {
            return B[bStart + k - 1];
        }
        if (bStart > B.length - 1) {
            return A[aStart + k - 1];
        }
        if (k == 1) {
            return Math.min(A[aStart],B[bStart]);
        }
        int aMid = Integer.MAX_VALUE,bMid = Integer.MAX_VALUE;
        if (aStart + k / 2 - 1 < A.length) {
            aMid = A[aStart + k / 2 - 1];
        }
        if (bStart + k / 2 - 1 < B.length) {
            bMid = B[bStart + k / 2 - 1];
        }
        if (aMid < bMid) {
            return getKth(A,aStart + k / 2,B,bStart,k - k / 2);
        }else {
            return getKth(A,aStart,B,bStart + k / 2, k - k / 2);
        }
    }
}
