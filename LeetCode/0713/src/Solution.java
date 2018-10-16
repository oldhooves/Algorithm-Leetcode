/**
 * 713. 乘积小于K的子数组
 * https://leetcode-cn.com/problems/subarray-product-less-than-k/description/
 * Created by 老蹄子 on 2018/10/16 下午9:57
 */
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1){
            return 0;
        }
        long multiply = 1l;
        int i = 0;
        int result = 0;
        for (int j = 0; j < nums.length; j++) {
            multiply *= nums[j];
            while (multiply >= k){
                multiply /= nums[i];
                i++;
            }
            result += (j - i + 1);
        }
        return result;
    }

}
