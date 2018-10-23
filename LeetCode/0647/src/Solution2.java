/**
 * Created by 老蹄子 on 2018/10/23 上午10:55
 */
public class Solution2 {

    int count = 0;
    public int countSubstrings(String s) {

        if (s == null || s.length() == 0){
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return count;
    }

    private void extendPalindrome(String s,int left,int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
}
