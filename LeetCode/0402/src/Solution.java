import java.util.Stack;

/**
 * 402. 移掉K位数字
 * https://leetcode-cn.com/classic/problems/remove-k-digits/description/
 * Created by ${laotizi} on 2019-03-18.
 */
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (k == len) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < len) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}