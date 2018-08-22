import java.util.Stack;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 * Created by 老蹄子 on 2018/8/22 下午5:12
 */
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                if (c == ')' && stack.pop() != '('){
                    return false;
                }
                if (c == ']' && stack.pop() != '['){
                    return false;
                }
                if (c =='}' && stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
