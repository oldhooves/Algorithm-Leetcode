
import java.util.HashMap;
import java.util.Map;

/**
 * 993. 二叉树的堂兄弟节点
 * https://leetcode-cn.com/problems/cousins-in-binary-tree/description/
 * Created by ${laotizi} on 2019-02-25.
 */
class Solution {

    Map<Integer,Integer> depth;
    Map<Integer,TreeNode> parent;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<Integer, Integer>();
        parent = new HashMap<Integer, TreeNode>();
        dfs(root,null);
        return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
    }

    private void dfs(TreeNode node, TreeNode par) {
        if (node != null) {
            depth.put(node.val,par != null ? 1 + depth.get(par.val) : 0);
            parent.put(node.val,par);
            dfs(node.left,node);
            dfs(node.right,node);
        }
    }
}