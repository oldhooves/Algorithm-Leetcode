/**
 * 680. 验证回文字符串 Ⅱ
 * https://leetcode-cn.com/problems/valid-palindrome-ii/description/
 * Created by 老蹄子 on 2018/10/21 下午2:07
 */
class Solution {
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                int j = s.length() - 1 - i;
                return (isPalindrome(s,i + 1,j) || isPalindrome(s,i,j - 1));
            }
        }
        return true;
    }

    private boolean isPalindrome(String s,int i,int j){
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().validPalindrome("abca"));
    }
}
