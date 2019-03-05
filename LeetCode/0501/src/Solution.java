import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 501. 二叉搜索树中的众数
 * https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/description/
 * Created by 老蹄子 on 2019/3/4 下午10:09
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

    Map<Integer,Integer> map;
    int max = 0;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        map = new HashMap<>();
        inOrder(root);
        List<Integer> list = new LinkedList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void inOrder(TreeNode node) {
        if (node.left != null) {
            inOrder(node.left);
        }
        map.put(node.val,map.getOrDefault(node.val,0) + 1);
        max = Math.max(max,map.get(node.val));
        if (node.right != null) {
            inOrder(node.right);
        }
    }
}
