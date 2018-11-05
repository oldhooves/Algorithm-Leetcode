/**
 * 707. 设计链表
 * https://leetcode-cn.com/problems/design-linked-list/description/
 * Created by 老蹄子 on 2018/11/5 下午4:34
 */
class MyLinkedList {

    int length;
    Node head;

    class Node{

        int value;
        Node next;
        Node(int x){
            this.value = x;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.length = 0;
        this.head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= this.length) {
            return -1;
        }else {
            int count = 0;
            Node cur = head;
            while (count != index) {
                cur = cur.next;
                count++;
            }
            return cur.value;
        }
    }


    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (this.length == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        this.length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        int count = 0;
        if (index == this.length) {
            addAtTail(val);
            return;
        }
        if (index > this.length) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        while (count != index - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.length) {
            return;
        }
        Node cur = head;
        if (index == 0) {
            head = cur.next;
        }else {
            Node current = head;
            Node pre = null;
            int count = 0;
            while (count != index) {
                pre = current;
                current = current.next;
                count++;
            }
            pre.next = current.next;
            this.length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */