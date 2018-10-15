/**
 * 55. 跳跃游戏
 * https://leetcode-cn.com/problems/jump-game/description/
 * Created by 老蹄子 on 2018/10/15 下午3:39
 */
class Solution {
    public boolean canJump(int[] nums) {

        int reach = 0;
        int i = 0;
        while (i < nums.length && i <= reach){
            reach = Math.max(reach,nums[i] + i);
            i++;
        }
        return reach >= nums.length - 1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(new Solution().canJump(nums));
    }
}