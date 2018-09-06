import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/description/
 * Created by 老蹄子 on 2018/9/6 下午7:50
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

    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        postorderTraversal(root,result);
        return result;
    }

    private void postorderTraversal(TreeNode node,List<Integer> list){
        if (node != null){
            postorderTraversal(node.left,list);
            postorderTraversal(node.right,list);
            list.add(node.val);
        }
    }
}

