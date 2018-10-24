import java.util.Stack;

/**
 * 227. 基本计算器 II
 * https://leetcode-cn.com/problems/basic-calculator-ii/description/
 * Created by 老蹄子 on 2018/10/24 下午1:31
 */
class Solution {
    public int calculate(String s) {
        int len = s.length();
        if (s == null || len == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i) || i == len - 1){
                if (sign == '+'){
                    stack.push(num);
                }
                if (sign == '-'){
                    stack.push(-num);
                }
                if (sign == '*'){
                    stack.push(num * stack.pop());
                }
                if (sign == '/'){
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;

            }
        }
        int res = 0;
        for (int i : stack){
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().calculate("1*2-3/4+5*6-7*8+9/10"));
    }
}