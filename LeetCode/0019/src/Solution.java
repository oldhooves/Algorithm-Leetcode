/**
 * 19. 删除链表的倒数第N个节点
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/description/
 * Created by 老蹄子 on 2018/9/5 下午1:23
 */
class Solution {

     public class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
         }
     }


    public ListNode removeNthFromEnd(ListNode head, int n) {

         ListNode dummyNode = new ListNode(0);
         dummyNode.next = head;

         ListNode p = dummyNode;
         ListNode q = dummyNode;
        for (int i = 0; i < n+1; i++) {
            q = q.next;
        }

        while (q != null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return dummyNode.next;
    }
}
