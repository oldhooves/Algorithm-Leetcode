/**
 * 856. 括号的分数
 * https://leetcode-cn.com/problems/score-of-parentheses/description/
 * Created by 老蹄子 on 2018/10/23 下午2:42
 */
class Solution {
    public int scoreOfParentheses(String S) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '('){
                count++;
            }
            else {
                count--;
            }
            if (S.charAt(i) == '(' && S.charAt(i + 1) == ')'){
                sum += Math.pow(2,count - 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().scoreOfParentheses("(()(()))"));
    }
}