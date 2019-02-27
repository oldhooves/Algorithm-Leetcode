/**
 * 230. 二叉搜索树中第K小的元素
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/description/
 * Created by ${laotizi} on 2019-02-27.
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

    public int kthSmallest(TreeNode root, int k) {
        int count = countNode(root.left);
        if (k <= count) {
            return kthSmallest(root.left,k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k - 1 - count);
        }
        return root.val;
    }

    private int countNode(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNode(node.left) + countNode(node.right);
    }
}