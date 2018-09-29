/**
 * 674. 最长连续递增序列
 * https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/description/
 * Created by ${laotizi} on 2018-09-29.
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int len = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]){
                len++;
                res = Math.max(res,len);
            }else {
                len = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int res = new Solution().findLengthOfLCIS(nums);
        System.out.println(res);
    }
}




