import java.util.Stack;

/**
 * 331. 验证二叉树的前序序列化
 * https://leetcode-cn.com/classic/problems/verify-preorder-serialization-of-a-binary-tree/description/
 * Created by 老蹄子 on 2019/3/17 下午10:16
 */
class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack = new Stack<>();
        String[] arr = preorder.split(",");
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
            while (stack.size() >= 3
                    && stack.get(stack.size() - 1).equals("#")
                    && stack.get(stack.size() - 2).equals("#")
                    && !stack.get(stack.size() - 3).equals("#")) {
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add("#");
            }
        }
        if (stack.size() == 1 && stack.pop().equals("#")) {
            return true;
        } else {
            return false;
        }
    }
}