/**
 * 326. 3的幂
 * https://leetcode-cn.com/problems/power-of-three/description/
 * Created by 老蹄子 on 2018/11/8 下午12:55
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        int count = 0;
        double temp = 0;
        while (true) {
            temp = Math.pow(3,count);
            if (n == temp) {
                return true;
            }
            if (n < temp) {
                return false;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(9));
    }
}