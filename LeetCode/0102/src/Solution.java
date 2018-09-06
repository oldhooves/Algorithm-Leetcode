import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层次遍历
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/description/
 * Created by 老蹄子 on 2018/9/6 下午8:33
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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null){
            return res;
        }

        queue.offer(root);
        int mark = 0;
        while (!queue.isEmpty()){
            mark = queue.size();
            List<Integer> tmpList = new ArrayList<>();
            TreeNode tmpNode = new TreeNode(0);
            for (int i = 0; i <mark ; i++) {
                tmpNode = queue.poll();
                tmpList.add(tmpNode.val);
                if (tmpNode.left != null){
                    queue.offer(tmpNode.left);
                }
                if (tmpNode.right != null){
                    queue.offer(tmpNode.right);
                }
            }
            res.add(tmpList);
        }
        return res;
    }
}
