/**
 * 342. 4的幂
 * https://leetcode-cn.com/problems/power-of-four/description/
 * Created by 老蹄子 on 2018/11/8 下午1:06
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        double result = Math.log10(num) / Math.log10(4);
        return (result == (int)result) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfFour(16));
    }
}