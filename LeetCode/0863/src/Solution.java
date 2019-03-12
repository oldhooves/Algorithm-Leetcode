import java.util.*;

/**
 * 863. 二叉树中所有距离为 K 的结点
 * https://leetcode-cn.com/classic/problems/all-nodes-distance-k-in-binary-tree/description/
 * Created by ${laotizi} on 2019-03-12.
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
    Map<TreeNode,List<TreeNode>> map = new HashMap<TreeNode, List<TreeNode>>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null || K < 0) {
            return res;
        }
        buildMap(root,null);
        if (!map.containsKey(target)) {
            return res;
        }
        Set<TreeNode> visited = new HashSet<TreeNode>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(target);
        visited.add(target);
        while (!q.isEmpty()) {
            int size = q.size();
            if (K == 0){
                for (int i = 0; i < size; i++) {
                    res.add(q.poll().val);
                }
                return res;
            }
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                for (TreeNode next : map.get(node)) {
                    if (visited.contains(next)) {
                        continue;
                    }
                    visited.add(next);
                    q.add(next);
                }
            }
            K--;
        }
        return res;
    }

    private void buildMap(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        if (!map.containsKey(node)) {
            map.put(node,new ArrayList<TreeNode>());
            if (parent != null) {
                map.get(node).add(parent);
                map.get(parent).add(node);
            }
            buildMap(node.left, node);
            buildMap(node.right,node);
        }
    }
}