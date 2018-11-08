/**
 * 367. 有效的完全平方数
 * https://leetcode-cn.com/problems/valid-perfect-square/description/
 * Created by 老蹄子 on 2018/11/8 下午1:11
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int count = 0;
        double temp;
        while (true) {
            temp = Math.pow(count,2);
            if (temp == num) {
                return true;
            }
            if (temp > num) {
                return false;
            }
            count++;
        }
    }
}
