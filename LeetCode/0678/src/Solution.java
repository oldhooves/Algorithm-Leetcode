/**
 * 678. 有效的括号字符串
 * https://leetcode-cn.com/problems/valid-parenthesis-string/description/
 * Created by 老蹄子 on 2018/10/25 下午1:05
 */
class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                low++;
                high++;
            }else if (s.charAt(i) == ')'){
                if (low > 0){
                    low--;
                }
                high--;
            }else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            if (high < 0){
                return false;
            }
        }
        return low == 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkValidString("(*))"));
    }
}