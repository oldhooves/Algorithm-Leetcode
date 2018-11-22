/**
 * 938. 二叉搜索树的范围和
 * https://leetcode-cn.com/problems/range-sum-of-bst/description/
 * Created by 老蹄子 on 2018/11/22 下午2:12
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

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right,L,R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left,L,R);
        }
        return root.val + rangeSumBST(root.right,L,R) + rangeSumBST(root.left,L,R);
    }


}