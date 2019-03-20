/**
 * 991. 坏了的计算器
 * https://leetcode-cn.com/classic/problems/broken-calculator/description/
 * Created by ${laotizi} on 2019-03-20.
 */
class Solution {
    public int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            ans++;
            if (Y % 2 == 1) {
                Y++;
            } else {
                Y /= 2;
            }
        }
        return ans + X - Y;
    }
}