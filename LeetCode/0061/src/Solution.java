/**
 * 61. 旋转链表
 * https://leetcode-cn.com/problems/rotate-list/description/
 * Created by 老蹄子 on 2018/11/6 下午5:23
 */
class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        for (int i = 0; fast.next != null; i++) {
            fast = fast.next;
            count++;
        }
        for (int j = count - k % count; j > 0; j--) {
            slow = slow.next;
        }

        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }
}