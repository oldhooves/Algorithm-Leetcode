/**
 * 669. 修剪二叉搜索树
 * https://leetcode-cn.com/problems/trim-a-binary-search-tree/description/
 * Created by 老蹄子 on 2019/2/20 下午9:09
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

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val < L) {
            return trimBST(root.right,L,R);
        }
        if (root.val > R) {
            return trimBST(root.left,L,R);
        }
        root.left = trimBST(root.left,L,R);
        root.right = trimBST(root.right,L,R);
        return root;
    }
}