/**
 * 8. 字符串转整数 (atoi)
 * https://leetcode-cn.com/problems/string-to-integer-atoi/description/
 * Created by 老蹄子 on 2018/10/25 下午4:08
 */
class Solution {
    public int myAtoi(String str) {

        int index = 0;
        int sign = 1;
        int total = 0;
        str = str.trim();
        if (str.length() == 0){
            return 0;
        }

        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9){
                break;
            }
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("+1"));
    }
}
