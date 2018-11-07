/**
 * 263. 丑数
 * https://leetcode-cn.com/problems/ugly-number/description/
 * Created by 老蹄子 on 2018/11/7 下午9:46
 */
class Solution {
    public boolean isUgly(int num) {
        for (int i = 2; i < 6 && num > 0; i++) {
            while (num % i == 0) {
                num /= i;
            }
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isUgly(8));
    }
}