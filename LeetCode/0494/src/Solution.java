/**
 * 494. 目标和
 * https://leetcode-cn.com/classic/problems/target-sum/description/
 * Created by ${laotizi} on 2019-03-08.
 */
class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums,0,0,S);
        return count;
    }

    private void calculate(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S) {
                count++;
            }
        }else {
            calculate(nums, i + 1, sum + nums[i], S);
            calculate(nums, i + 1, sum - nums[i], S);
        }
    }
}