import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N叉树的层序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/description/
 * Created by ${laotizi} on 2019-02-19.
 */
class Solution {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> curLevel = new LinkedList<Integer>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                curLevel.add(cur.val);
                for (Node c : cur.children) {
                    queue.offer(c);
                }
            }
            ret.add(curLevel);
        }
        return ret;
    }
}