import java.util.Stack;

/**
 * 1003. 检查替换后的词是否有效
 * https://leetcode-cn.com/classic/problems/check-if-word-is-valid-after-substitutions/description/
 * Created by 老蹄子 on 2019/3/17 下午5:14
 */
class Solution {
    public boolean isValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == 'c') {
                if (stack.isEmpty() || stack.pop() != 'b') {
                    return false;
                }
                if (stack.isEmpty() || stack.pop() != 'a') {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}