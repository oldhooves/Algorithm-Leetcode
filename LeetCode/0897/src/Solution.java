import java.util.ArrayList;
import java.util.List;

/**
 * 897. 递增顺序查找树
 * https://leetcode-cn.com/problems/increasing-order-search-tree/description/
 * Created by 老蹄子 on 2019/2/23 下午9:23
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

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root,vals);
        TreeNode ans = new TreeNode(0),cur = ans;
        for (int v : vals) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }

    private void inorder(TreeNode node, List<Integer> vals) {
        if (node == null) {
            return;
        }
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right,vals);
    }
}
