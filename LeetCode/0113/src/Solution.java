import java.util.LinkedList;
import java.util.List;

/**
 * 113. 路径总和 II
 * https://leetcode-cn.com/problems/path-sum-ii/description/
 * Created by 老蹄子 on 2019/2/28 下午8:09
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

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> currentResult = new LinkedList<>();
        pathSum(root,sum,currentResult,result);
        return result;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> currentResult,
                         List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        currentResult.add(new Integer(root.val));
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new LinkedList<>(currentResult));
            currentResult.remove(currentResult.size() - 1);
            return;
        }else {
            pathSum(root.left,sum - root.val,currentResult,result);
            pathSum(root.right,sum - root.val,currentResult,result);
        }
        currentResult.remove(currentResult.size() - 1);
    }
}