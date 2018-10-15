/**
 * 560. 和为K的子数组
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/description/
 * Created by 老蹄子 on 2018/10/15 下午7:42
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int sum = nums[i];
            if (sum == k){
                ++res;
            }
            for (int j = i + 1; j < len; j++) {
                sum += nums[j];
                if (sum == k){
                    ++res;
                }
            }
        }
        return res;
    }
}
