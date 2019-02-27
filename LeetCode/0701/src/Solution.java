/**
 * 701. 二叉搜索树中的插入操作
 * https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/description/
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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode cur = root;
        while (true) {
            if (cur.val <= val) {
                if (cur.right != null) {
                    cur = cur.right;
                }else {
                    cur.right = new TreeNode(val);
                    break;
                }
            }else {
                if (cur.left != null) {
                    cur = cur.left;
                }else {
                    cur.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}