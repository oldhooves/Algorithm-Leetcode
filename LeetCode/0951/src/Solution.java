/**
 * 951. 翻转等价二叉树
 * https://leetcode-cn.com/problems/flip-equivalent-binary-trees/description/
 * Created by 老蹄子 on 2019/3/1 下午8:32
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

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return (flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right) ||
                flipEquiv(root1.right,root2.left) && flipEquiv(root1.left,root2.right));
    }
}
