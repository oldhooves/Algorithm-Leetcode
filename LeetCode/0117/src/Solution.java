/**
 * 117. 填充每个节点的下一个右侧节点指针 II
 * https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/description/
 * Created by 老蹄子 on 2019/3/6 下午8:08
 */
class Solution {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node cur = root;
        while (cur != null) {
            if (cur.left != null) {
                cur.left.next = (cur.right != null) ? cur.right : getNext(cur);
            }
            if (cur.right != null) {
                cur.right.next = getNext(cur);
            }
            cur = cur.next;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    private Node getNext(Node root) {
        Node temp = root.next;
        while (temp != null) {
            if (temp.left != null) {
                return temp.left;
            }
            if (temp.right != null) {
                return temp.right;
            }
            temp = temp.next;
        }
        return null;
    }
}