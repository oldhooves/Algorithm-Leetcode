import java.util.Stack;

/**
 * 946. 验证栈序列
 * https://leetcode-cn.com/classic/problems/validate-stack-sequences/description/
 * Created by 老蹄子 on 2019/3/17 下午5:58
 */
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = popped.length;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int x : pushed) {
            stack.push(x);
            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == N;
    }
}