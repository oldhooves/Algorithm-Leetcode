/**
 * 865. 具有所有最深结点的最小子树
 * https://leetcode-cn.com/problems/smallest-subtree-with-all-the-deepest-nodes/description/
 * Created by 老蹄子 on 2019/3/4 下午9:52
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

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) {
            return null;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (left == right) {
            return root;
        }
        if (left > right) {
            return subtreeWithAllDeepest(root.left);
        }
        return subtreeWithAllDeepest(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
