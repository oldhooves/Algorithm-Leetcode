import java.util.Stack;

/**
 * 84. 柱状图中最大的矩形
 * https://leetcode-cn.com/classic/problems/largest-rectangle-in-histogram/description/
 * Created by ${laotizi} on 2019-03-19.
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        Stack<Integer> index = new Stack<>();
        index.push(-1);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (index.peek() > -1) {
                if (heights[index.peek()] > heights[i]) {
                    int top = index.pop();
                    max = Math.max(max,heights[top] * (i - 1 - index.peek()));
                } else {
                    break;
                }
            }
            index.push(i);
        }
        while (index.peek() != -1) {
            int top = index.pop();
            max = Math.max(max,heights[top] * (heights.length - 1 - index.peek()));
        }
        return max;
    }
}