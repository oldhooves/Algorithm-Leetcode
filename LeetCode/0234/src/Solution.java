import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 * Created by 老蹄子 on 2018/11/5 下午2:37
 */
class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < list.size(); i++) {
           if (!list.get(i).equals(list.get(list.size() - 1 - i)) ){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-129);
        head.next = new ListNode(-129);
        System.out.println(new Solution().isPalindrome(head));
    }
}