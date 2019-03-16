import java.util.Stack;

/**
 * 682. 棒球比赛
 * https://leetcode-cn.com/classic/problems/baseball-game/description/
 * Created by 老蹄子 on 2019/3/16 下午9:40
 */
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        for (int score : stack) {
            ans += score;
        }
        return ans;
    }
}