/**
 * 70. 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/description/
 * Created by 老蹄子 on 2018/9/11 下午10:04
 */
class Solution {


    public int climbStairs(int n) {

        int memo[] = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}