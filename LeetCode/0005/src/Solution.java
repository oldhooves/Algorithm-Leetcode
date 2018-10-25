/**
 * 5. 最长回文子串
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 * Created by 老蹄子 on 2018/10/24 下午10:17
 */
class Solution {

    private int index;
    private int maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2){
            return s;
        }
        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i + 1);
        }
        return s.substring(index,index + maxLen);
    }

    private void extendPalindrome(String s,int j,int k){
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if (maxLen < k - j - 1){
            index = j + 1;
            maxLen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}