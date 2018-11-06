import java.util.HashMap;

/**
 * 138. 复制带随机指针的链表
 * https://leetcode-cn.com/problems/copy-list-with-random-pointer/description/
 * Created by 老蹄子 on 2018/11/6 下午9:09
 */
public class Solution {

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    HashMap<RandomListNode,RandomListNode> visitedHash = new HashMap<>();

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        if (this.visitedHash.containsKey(head)) {
            return this.visitedHash.get(head);
        }

        RandomListNode node = new RandomListNode(head.label);
        this.visitedHash.put(head,node);

        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
