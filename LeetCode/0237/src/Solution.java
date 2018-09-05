/**
 * 237. 删除链表中的节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/description/
 * Created by 老蹄子 on 2018/9/5 上午11:00
 */
class Solution {

     public class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
         }
     }


    public void deleteNode(ListNode node) {

         node.val = node.next.val;
         node.next = node.next.next;
    }
}