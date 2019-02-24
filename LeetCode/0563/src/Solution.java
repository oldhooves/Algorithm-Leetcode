/**
 * 563. 二叉树的坡度
 * https://leetcode-cn.com/problems/binary-tree-tilt/description/
 * Created by 老蹄子 on 2019/2/24 下午8:09
 */
class Solution {

    int result = 0;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }

    private int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        result += Math.abs(left - right);
        return left + right + root.val;
    }
}
