import java.util.Arrays;
import java.util.Stack;

/**
 * 503. 下一个更大元素 II
 * https://leetcode-cn.com/classic/problems/next-greater-element-ii/description/
 * Created by 老蹄子 on 2019/3/17 下午7:24
 */
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length,next[] = new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                next[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return next;
    }
}