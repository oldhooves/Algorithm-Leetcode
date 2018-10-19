/**
 * 125. 验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/description/
 * Created by 老蹄子 on 2018/10/19 下午3:28
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null){
            return false;
        }
        if (s.length() == 1){
            return true;
        }
        char[] ch = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                ch[count] = s.charAt(i);
                count++;
            }
        }
        int start = 0;
        int end = count - 1;
        while (start < end){

            if ((ch[start] == ch[end]) || (Math.abs(ch[start] - ch[end]) == 32 && ch[start] >= 'A' && ch[end] >= 'A')){
                start++;
                end--;
            }else {
                break;
            }

        }
        if (start >= end){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("0P"));
    }
}
