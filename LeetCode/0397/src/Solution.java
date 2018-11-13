/**
 * 397. 整数替换
 * https://leetcode-cn.com/problems/integer-replacement/description/
 * Created by 老蹄子 on 2018/11/13 下午9:02
 */
class Solution {
    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE) {
            return 32;
        }
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                if ((n + 1) % 4 == 0 && (n - 1) != 2) {
                    n++;
                }
                else {
                    n--;
                }
            }
            count++;
        }
        return count;
    }
}
