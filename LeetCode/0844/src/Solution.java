import java.util.Stack;

/**
 * 844. 比较含退格的字符串
 * https://leetcode-cn.com/classic/problems/backspace-string-compare/description/
 * Created by 老蹄子 on 2019/3/16 下午9:55
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        String s = helper(S);
        String t = helper(T);
        return s.equals(t);
    }

    private String helper(String str) {
        Stack<Character> stack = new Stack<>();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    continue;
                } else {
                    stack.pop();
                }
            }
        }
        for (Character c : stack) {
            res += c;
        }
        return res;
    }
}