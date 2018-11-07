/**
 * 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/description/
 * Created by 老蹄子 on 2018/11/7 下午7:44
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x <= 9 && x >= 0) {
            return true;
        }
        String temp = String.valueOf(x);
        int i = 0;
        int j = temp.length() - 1;

        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(-121));
    }
}