/**
 * 437. 路径总和 III
 * https://leetcode-cn.com/problems/path-sum-iii/description/
 * Created by 老蹄子 on 2018/9/8 下午3:18
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

    public int pathSum(TreeNode root, int sum) {

        if (root == null){
            return 0;
        }

        return findPath(root,sum) + pathSum(root.right,sum) + pathSum(root.left,sum);

    }

    private int findPath(TreeNode node, int num) {

        if (node == null){
            return 0;
        }

        int res = 0;
        if (node.val == num){
            res += 1;
        }

        res += findPath(node.left,num - node.val);
        res += findPath(node.right, num - node.val);

        return res;
    }
}
