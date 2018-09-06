import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
 * Created by 老蹄子 on 2018/9/6 下午4:49
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

    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        preorderTraversal(root,result);
        return result;
    }

    private void preorderTraversal(TreeNode node,List<Integer> list){
        if (node != null){
            list.add(node.val);
            preorderTraversal(node.left,list);
            preorderTraversal(node.right,list);
        }
    }
}
