import sun.java2d.pipe.SolidTextRenderer;

/**
 * 541. 反转字符串 II
 * https://leetcode-cn.com/problems/reverse-string-ii/description/
 * Created by 老蹄子 on 2018/10/19 下午2:40
 */
class Solution {
    public String reverseStr(String s, int k) {
        if (s.length() <= k){
            return new StringBuilder(s).reverse().toString();
        }
        else if (s.length() <= 2 * k){
            return new StringBuilder(s.substring(0,k)).reverse().toString() + s.substring(k);
        }
        String result = "";
        while (s.length() > 2 * k){
            result += reverseStr(s.substring(0,2 * k),k);
            s = s.substring(2 * k);
        }
        result += reverseStr(s,k);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseStr("abcdefg",2));
    }
}
