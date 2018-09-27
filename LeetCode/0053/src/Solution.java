/**
 * 53. 最大子序和
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 * Created by 老蹄子 on 2018/9/27 下午8:25
 */
class Solution {

    public int maxSubArray(int[] nums) {

        int ans = 0;
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (ans < 0){
                ans = 0;
            }
            ans += nums[i];
            max = Math.max(ans,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = new Solution().maxSubArray(nums);
        System.out.println(res);
    }
}