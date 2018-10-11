/**
 * 795. 区间子数组个数
 * https://leetcode-cn.com/problems/number-of-subarrays-with-bounded-maximum/description/
 * Created by 老蹄子 on 2018/10/11 下午5:22
 */
class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int len = A.length;
        int ans = 0;
        int left = -1;
        int right = -1;
        for (int i = 0; i < len; i++) {
            if (A[i] > R){
                left = i;
                right = i;
            }
            else if (A[i] < L){
                ans += (i - left) - (i - right);
            }
            else {
                ans += (i - left);
                right = i;
            }
        }
        return ans;
    }
}
