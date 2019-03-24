/**
 * 740. 删除与获得点数
 * https://leetcode-cn.com/classic/problems/delete-and-earn/description/
 * Created by 老蹄子 on 2019/3/24 下午12:58
 */
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10002];
        for (int i = 0; i < nums.length; i++) {
            sum[nums[i]] += nums[i];
        }
        for (int i = 2; i < sum.length; i++) {
            sum[i] = Math.max(sum[i - 1],sum[i - 2] + sum[i]);
        }
        return sum[10001];
    }
}