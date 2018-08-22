/**
 * 203. 删除链表中的节点
 * https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 * Created by 老蹄子 on 2018/8/22 下午10:49
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val){
            ListNode deleteNode = head;
            head = head.next;
            deleteNode = null;
        }

        if (head == null){
            return null;
        }
        ListNode pre = head;
        while (pre.next != null){
            if (pre.next.val == val){
                ListNode deleteNode = pre.next;
                pre.next = deleteNode.next;
                deleteNode.next = null;
            }
            else {
                pre = pre.next;
            }
        }
        return head;
    }
}
