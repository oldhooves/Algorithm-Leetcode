import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * https://leetcode-cn.com/problems/binary-tree-paths/description/
 * Created by 老蹄子 on 2018/9/7 下午10:49
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

    public List<String> binaryTreePaths(TreeNode root) {

        ArrayList<String> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        if (root.left == null && root.right == null){
            res.add(Integer.toString(root.val));
            return res;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        for (String s : leftPaths) {
            res.add(root.val + "->" + s);
        }

        List<String> rightPaths = binaryTreePaths(root.right);
        for (String s : rightPaths) {
            res.add(root.val + "->" +s);
        }

        return res;
    }
}
