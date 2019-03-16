import java.util.Stack;

/**
 * 232. 用栈实现队列
 * https://leetcode-cn.com/classic/problems/implement-queue-using-stacks/description/
 * Created by 老蹄子 on 2019/3/16 下午2:57
 */
class MyQueue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackTemp = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack.isEmpty()) {
            stackTemp.push(stack.pop());
        }
        stack.push(x);
        while (!stackTemp.isEmpty()) {
            stack.push(stackTemp.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
