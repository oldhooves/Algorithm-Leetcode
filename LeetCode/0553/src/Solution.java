/**
 * 553. 最优除法
 * https://leetcode-cn.com/problems/optimal-division/description/
 * Created by 老蹄子 on 2018/11/4 下午10:21
 */
class Solution {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return nums[0] + "";
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder sb = new StringBuilder(nums[0] + "/(" + nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sb.append("/" + nums[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}
