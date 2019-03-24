import java.util.Arrays;

/**
 * 377. 组合总和 Ⅳ
 * https://leetcode-cn.com/classic/problems/combination-sum-iv/description/
 * Created by 老蹄子 on 2019/3/24 下午5:59
 */
class Solution {
    private int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        return helper(nums,target);
    }

    private int helper(int[] nums, int target) {
        if (dp[target] != -1) {
            return dp[target];
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += helper(nums,target - nums[i]);
            }
        }
        dp[target] = res;
        return res;
    }
}