/**
 * 25. k个一组翻转链表
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/description/
 * Created by 老蹄子 on 2018/11/7 下午1:27
 */
class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy,pre = dummy,temp;
        int count;
        while (true) {
            count = k;
            while (count > 0 && tail != null) {
                count--;
                tail = tail.next;
            }
            if (tail == null) {
                break;
            }
            head = pre.next;

            while (pre.next != tail) {
                temp = pre.next;
                pre.next = temp.next;
                temp.next = tail.next;
                tail.next = temp;
            }

            tail = head;
            pre = head;
        }
        return dummy.next;
    }
}
