/**
 * 45. 跳跃游戏 II
 * https://leetcode-cn.com/classic/problems/jump-game-ii/description/
 * Created by 老蹄子 on 2019/3/22 下午8:19
 */
class Solution {
    public int jump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}