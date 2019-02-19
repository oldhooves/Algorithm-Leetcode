/**
 * 700. 二叉搜索树中的搜索
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/description/
 * Created by ${laotizi} on 2019-02-19.
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

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }
        if (root.val == val) {
            return root;
        }
        else {
            return val < root.val ? searchBST(root.left,val) : searchBST(root.right,val);
        }
    }
}