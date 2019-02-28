/**
 * 129. 求根到叶子节点数字之和
 * https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/description/
 * Created by ${laotizi} on 2019-02-28.
 */
class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }

    private int sum(TreeNode n, int s) {
        if (n == null) {
            return 0;
        }
        if (n.right == null && n.left == null) {
            return s * 10 + n.val;
        }
        return sum(n.left,s * 10 + n.val) + sum(n.right,s * 10 + n.val);
    }
}