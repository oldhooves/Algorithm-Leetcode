import java.util.List;

/**
 * 24. 两两交换链表中的节点
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/description/
 * Created by 老蹄子 on 2018/9/5 上午10:36
 */
class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;

        ListNode p = dummyhead;
        while (p.next != null && p.next.next != null){
            ListNode node1 = p.next;
            ListNode node2 = node1.next;
            ListNode next = node2.next;
            node2.next = node1;
            node1.next = next;
            p.next = node2;

            p = node1;
        }
        return dummyhead.next;
    }
}
