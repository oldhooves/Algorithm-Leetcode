import java.util.Stack;

/**
 * 430. 扁平化多级双向链表
 * https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/description/
 * Created by 老蹄子 on 2018/11/6 下午7:40
 */
class Solution {

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {}

        public Node(int _val,Node _prev,Node _next,Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

    public Node flatten(Node head) {
        Stack<Node> stack = new Stack<>();
        Node dummy = new Node();
        dummy.next = head;
        Node travel = head;
        while (travel != null || !stack.isEmpty()) {
            if (travel.child != null) {
                if (travel.next != null) {
                    stack.push(travel.next);
                }
                travel.next = travel.child;
                travel.next.prev = travel;
                travel.child = null;
            }else {
                if (travel.next == null && !stack.isEmpty()) {
                    travel.next = stack.pop();
                    travel.next.prev = travel;
                }
            }
            travel = travel.next;
        }
        return dummy.next;
    }
}