/**
 * 344. 反转字符串
 * https://leetcode-cn.com/problems/reverse-string/description/
 * Created by 老蹄子 on 2018/10/17 下午4:38
 */
class Solution {
    public String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        s = reverse.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new Solution().reverseString(s));
    }
}