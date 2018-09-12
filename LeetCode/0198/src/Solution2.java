/**
 * 198. 打家劫舍
 * https://leetcode-cn.com/problems/house-robber/description/
 * Created by 老蹄子 on 2018/9/12 下午10:24
 */
public class Solution2 {

    public int rob(int[] nums){

        int n = nums.length;
        if (n == 0){
            return 0;
        }

        int[] memo = new int[nums.length];
        memo[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                memo[i] = Math.max(memo[i],nums[j] + (j + 2 < n ?memo[j + 2] : 0));
            }
        }

        return memo[0];
    }

}
