/**
 * 112. 路径总和
 * https://leetcode-cn.com/problems/path-sum/description/
 * Created by 老蹄子 on 2018/9/7 下午10:00
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

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null){
            return false;
        }

        if (root.left == null && root.right == null){
            return root.val == sum;
        }

        if (hasPathSum(root.left,sum - root.val)){
            return true;
        }

        if (hasPathSum(root.right,sum-root.val)){
            return true;
        }
        return false;

    }
}
