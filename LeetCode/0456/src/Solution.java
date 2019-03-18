/**
 * 456. 132模式
 * https://leetcode-cn.com/classic/problems/132-pattern/description/
 * Created by 老蹄子 on 2019/3/18 下午8:24
 */
class Solution {
    public boolean find132pattern(int[] nums) {
        int min_i = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length - 1; j++) {
            min_i = Math.min(min_i,nums[j]);
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[k] < nums[j] && min_i < nums[k]) {
                    return true;
                }
            }
        }
        return false;
    }
}