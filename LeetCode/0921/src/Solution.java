import java.util.Stack;

/**
 * 921. 使括号有效的最少添加
 * https://leetcode-cn.com/classic/problems/minimum-add-to-make-parentheses-valid/description/
 * Created by 老蹄子 on 2019/3/17 下午3:33
 */
class Solution {
    public int minAddToMakeValid(String S) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (!stack.isEmpty()){
                    stack.pop();
                } else {
                    count++;
                }
            }
        }
        return count + stack.size();
    }
}