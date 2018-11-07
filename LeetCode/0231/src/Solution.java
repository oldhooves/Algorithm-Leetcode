/**
 * 231. 2的幂
 * https://leetcode-cn.com/problems/power-of-two/description/
 * Created by 老蹄子 on 2018/11/7 下午8:58
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(15));
    }
}