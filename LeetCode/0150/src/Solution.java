import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 * https://leetcode-cn.com/classic/problems/evaluate-reverse-polish-notation/description/
 * Created by 老蹄子 on 2019/3/17 下午8:21
 */
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int temp1,temp2;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp1 + temp2);
            } else if (tokens[i].equals("-")) {
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else if (tokens[i].equals("*")) {
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp2 * temp1);
            } else if (tokens[i].equals("/")) {
                temp1 = stack.pop();
                temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
