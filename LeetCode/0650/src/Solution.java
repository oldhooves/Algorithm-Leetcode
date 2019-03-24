/**
 * 650. 只有两个键的键盘
 * https://leetcode-cn.com/classic/problems/2-keys-keyboard/description/
 * Created by 老蹄子 on 2019/3/24 下午6:56
 */
class Solution {
    public int minSteps(int n) {
        int ans = 0,d = 2;
        while (n > 1) {
            while (n % d == 0) {
                ans += d;
                n /= d;
            }
            d++;
        }
        return ans;
    }
}
