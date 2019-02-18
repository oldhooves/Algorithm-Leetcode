import java.util.List;

/**
 * 559. N叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/description/
 * Created by 老蹄子 on 2019/2/18 下午8:30
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

    private int max = 0;

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        maxDepth(root, 1);
        return max;
    }

    private void maxDepth(Node node, int depth) {
        if (node == null) {
            return;
        }
        max = Math.max(max, depth);
        for (Node child : node.children) {
            maxDepth(child, depth + 1);
        }
    }
}