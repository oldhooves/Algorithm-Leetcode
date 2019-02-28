/**
 * 337. 打家劫舍 III
 * https://leetcode-cn.com/problems/house-robber-iii/description/
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

    public int rob(TreeNode root) {
        return Math.max(robInclude(root),robExclude(root));
    }

    private int robInclude(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return robExclude(root.left) + robExclude(root.right) + root.val;
    }

    private int robExclude(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(robInclude(root.left),robExclude(root.left)) + Math.max(robInclude(root.right),robExclude(root.right));
    }
}