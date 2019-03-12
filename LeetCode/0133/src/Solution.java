import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 133. 克隆图
 * https://leetcode-cn.com/classic/problems/clone-graph/description/
 * Created by ${laotizi} on 2019-03-12.
 */
class Solution {

    private HashMap<Node,Node> map = new HashMap<Node, Node>();

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val,List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node temp = new Node(node.val,new ArrayList<Node>());
        map.put(node,temp);
        for (Node neighbor : node.neighbors) {
            temp.neighbors.add(cloneGraph(neighbor));
        }
        return map.get(node);
    }

}