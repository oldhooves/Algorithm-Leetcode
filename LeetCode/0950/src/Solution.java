import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 950. 按递增顺序显示卡牌
 * https://leetcode-cn.com/problems/reveal-cards-in-increasing-order/
 * Created by 老蹄子 on 2019/4/5 下午1:57
 */
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck == null || deck.length == 0) {
            return deck;
        }
        int[] res = new int[deck.length];
        Arrays.sort(deck);
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(deck[deck.length - 1]);
        for (int i = deck.length - 2; i >= 0; i--) {
            queue.offerFirst(queue.pollLast());
            queue.offerFirst(deck[i]);
        }
        for (int i = 0; i < deck.length; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}