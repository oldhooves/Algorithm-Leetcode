import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 * Created by 老蹄子 on 2018/9/6 下午7:41
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

    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(root,result);
        return result;
    }

    private void inorderTraversal(TreeNode node,List<Integer> list){
        if (node != null){
            inorderTraversal(node.left,list);
            list.add(node.val);
            inorderTraversal(node.right,list);
        }
    }
}
