/**
 * 235. 二叉搜索树的最近公共祖先
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 * Created by 老蹄子 on 2018/9/8 下午4:00
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

        if (root == null){
            return null;
        }

        if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }

        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;
    }
}
