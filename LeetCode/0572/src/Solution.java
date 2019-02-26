/**
 * 572. 另一个树的子树
 * https://leetcode-cn.com/problems/subtree-of-another-tree/description/
 * Created by ${laotizi} on 2019-02-26.
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

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if (isSame(s,t)){
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    private boolean isSame(TreeNode s ,TreeNode t){
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isSame(s.left,t.left) && isSame(s.right,t.right);
    }
}