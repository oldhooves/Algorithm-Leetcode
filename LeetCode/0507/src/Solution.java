/**
 * 507. 完美数
 * https://leetcode-cn.com/problems/perfect-number/description/
 * Created by 老蹄子 on 2018/11/8 下午5:08
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int res = 0;
        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) {
                res += i;
                res += num / i;
            }
        }
        return res == num * 2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkPerfectNumber(99999993));
    }
}
