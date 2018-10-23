/**
 * 12. 整数转罗马数字
 * https://leetcode-cn.com/problems/integer-to-roman/description/
 * Created by 老蹄子 on 2018/10/23 下午2:09
 */
class Solution {
    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num%100) / 10] + I[num % 10];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(9));
    }
}