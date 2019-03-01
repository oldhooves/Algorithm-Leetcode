/**
 * 236. 二叉树的最近公共祖先
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 * Created by 老蹄子 on 2019/3/1 下午8:46
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
