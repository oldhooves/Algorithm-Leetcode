import java.util.Arrays;

/**
 * 136. 只出现一次的数字
 * https://leetcode-cn.com/problems/single-number/description/
 * Created by 老蹄子 on 2018/11/19 下午11:04
 */
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i != len; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}