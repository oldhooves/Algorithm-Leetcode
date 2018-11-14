/**
 * 523. 连续的子数组和
 * https://leetcode-cn.com/problems/continuous-subarray-sum/description/
 * Created by 老蹄子 on 2018/11/14 下午3:34
 */
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                flag = true;
            }
        }
        if (flag && k == 0) {
            return true;
        }
        if (!flag && k == 0) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
