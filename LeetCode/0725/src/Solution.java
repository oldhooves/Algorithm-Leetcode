/**
 * 725. 分隔链表
 * https://leetcode-cn.com/problems/split-linked-list-in-parts/description/
 * Created by 老蹄子 on 2018/11/6 下午2:29
 */
class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode cur = root;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        int width = count / k;
        int rem = count % k;

        ListNode[] ans = new ListNode[k];
        cur = root;
        for (int i = 0; i < k; i++) {
            ListNode head = new ListNode(-1);
            ListNode temp = head;
            for (int j = 0; j < width + (i < rem ? 1 : 0); j++) {
                temp.next = new ListNode(cur.val);
                temp = temp.next;
                if (cur != null){
                    cur = cur.next;
                }
            }
            ans[i] = head.next;
        }
        return ans;
    }
}
