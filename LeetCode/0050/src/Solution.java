/**
 * 50. Pow(x, n)
 * https://leetcode-cn.com/problems/powx-n/description/
 * Created by 老蹄子 on 2018/11/13 下午4:46
 */
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        int t = n / 2;
        if (n < 0) {
            t = -t;
            x = 1 / x;
        }
        double res = myPow(x,t);
        if (n % 2 == 0) {
            return res * res;
        }
        return res * res * x;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.00000, -2));
    }
}