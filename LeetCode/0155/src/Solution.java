/**
 * 155. 最小栈
 * https://leetcode-cn.com/classic/problems/min-stack/description/
 * Created by 老蹄子 on 2019/3/16 下午12:49
 */
class MinStack {

    class Node{
        int val;
        int min;
        Node next;

        Node(int x, int min) {
            this.val = x;
            this.min = min;
            next = null;
        }
    }

    Node head;
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x,x);
        }else {
            Node n = new Node(x,Math.min(x,head.min));
            n.next = head;
            head = n;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head != null) {
            return head.val;
        }
        return -1;
    }

    public int getMin() {
        if (head != null) {
            return head.min;
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */