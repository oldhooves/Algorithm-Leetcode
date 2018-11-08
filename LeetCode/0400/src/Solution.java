/**
 * 400. 第N个数字
 * https://leetcode-cn.com/problems/nth-digit/description/
 * Created by 老蹄子 on 2018/11/8 下午7:44
 */
class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findNthDigit(15));
    }
}