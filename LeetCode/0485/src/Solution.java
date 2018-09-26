/**
 * 485. 最大连续1的个数
 * https://leetcode-cn.com/problems/max-consecutive-ones/description/
 * Created by 老蹄子 on 2018/9/26 下午9:31
 */
class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int res = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1){
                cur++;
            }else {
                res = Math.max(res,cur);
                cur = 0;
            }
        }
        return Math.max(cur,res);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int result = new Solution().findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
