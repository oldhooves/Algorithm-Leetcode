/**
 * 172. 阶乘后的零
 * https://leetcode-cn.com/problems/factorial-trailing-zeroes/description/
 * Created by 老蹄子 on 2018/11/8 下午1:22
 */
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().trailingZeroes(5));
    }
}
