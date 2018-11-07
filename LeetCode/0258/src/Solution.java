/**
 * 258. 各位相加
 * https://leetcode-cn.com/problems/add-digits/description/
 * Created by 老蹄子 on 2018/11/7 下午4:44
 */
class Solution {
    public int addDigits(int num) {
        while (String.valueOf(num).length() != 1) {
            int temp = 0;
            char[] c = String.valueOf(num).toCharArray();
            for (int i = 0; i < c.length; i++) {
                temp += c[i] - '0';
            }
            num = temp;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(38));
    }
}