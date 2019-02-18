import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 965. 单值二叉树
 * https://leetcode-cn.com/problems/univalued-binary-tree/description/
 * Created by 老蹄子 on 2019/2/17 下午10:38
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

    List<Integer> vals;

    public boolean isUnivalTree(TreeNode root) {
        vals = new ArrayList<>();
        dfs(root);
        for (int v : vals) {
            if (v != vals.get(0)) {
                return false;
            }
        }
        return true;
    }

    private void dfs(TreeNode node) {
        if (node != null) {
            vals.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }
}
