/**
 * 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 * Created by 老蹄子 on 2018/9/4 下午9:12
 */
class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
