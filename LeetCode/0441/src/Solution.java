/**
 * 441. 排列硬币
 * https://leetcode-cn.com/problems/arranging-coins/description/
 * Created by 老蹄子 on 2018/11/8 下午2:59
 */
class Solution {
    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int res = (int)(Math.sqrt(n) * Math.sqrt(2)) - 1;
        if ((res + 2) * (res + 1) <= 2 * n) {
            return res + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().arrangeCoins(1804289383));
    }
}