/**
 * 203. 删除链表中的节点
 * https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 * Created by 老蹄子 on 2018/9/4 下午10:46
 */
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode cur = dummyNode;
        while (cur.next != null){
            if (cur.next.val == val){
                ListNode deleteNode = cur.next;
                cur.next = deleteNode.next;
                deleteNode.next = null;
            }
            else {
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }

}
