import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/description/
 * Created by 老蹄子 on 2018/11/5 下午3:28
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}