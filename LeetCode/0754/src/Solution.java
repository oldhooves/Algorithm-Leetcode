/**
 * 754. 到达终点数字
 * https://leetcode-cn.com/problems/reach-a-number/description/
 * Created by 老蹄子 on 2018/11/13 下午8:26
 */
class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
}