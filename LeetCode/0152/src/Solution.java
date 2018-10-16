/**
 * 152. 乘积最大子序列
 * https://leetcode-cn.com/problems/maximum-product-subarray/description/
 * Created by 老蹄子 on 2018/10/16 下午1:35
 */
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int maxNum = nums[0];
        int minNum = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int maxNum_temp = maxNum;
            int minNum_temp = minNum;
            maxNum = Math.max(nums[i],Math.max(nums[i] * maxNum_temp,nums[i] * minNum_temp));
            minNum = Math.min(nums[i],Math.min(nums[i] * maxNum_temp,nums[i] * minNum_temp));
            res = Math.max(res,maxNum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,-1   };
        System.out.println(new Solution().maxProduct(nums));
    }
}
