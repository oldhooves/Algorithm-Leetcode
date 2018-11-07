/**
 * 415. 字符串相加
 * https://leetcode-cn.com/problems/add-strings/description/
 * Created by 老蹄子 on 2018/11/7 下午10:06
 */
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) /10;
        }
        return sb.reverse().toString();
    }
}