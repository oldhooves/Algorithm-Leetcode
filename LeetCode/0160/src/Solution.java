/**
 * 160. 相交链表
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/description/
 * Created by 老蹄子 on 2018/11/5 下午1:15
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lenA > lenB) {
            int distance = lenA - lenB;
            for (int i = 0; i < distance && tempA != null; i++) {
                tempA = tempA.next;
            }
        }else {
            int distance = lenB - lenA;
            for (int i = 0; i < distance && tempB != null; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != null && tempB != null && tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}