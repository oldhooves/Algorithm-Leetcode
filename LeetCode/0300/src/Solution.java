import java.util.Arrays;

/**
 * 300. 最长上升子序列
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/description/
 * Created by 老蹄子 on 2018/9/16 下午9:57
 */
class Solution {

    public int lengthOfLIS(int[] nums) {

        if (nums.length == 0){
            return 0;
        }

        int memo[] = new int[nums.length];
        Arrays.fill(memo,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    memo[i] = Math.max(memo[i],1 + memo[j]);
                }
            }
        }

        int res = memo[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res,memo[i]);
        }

        return res;
    }
}
