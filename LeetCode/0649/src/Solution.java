import java.util.LinkedList;
import java.util.Queue;

/**
 * 649. Dota2 参议院
 * https://leetcode-cn.com/classic/problems/dota2-senate/description/
 * Created by 老蹄子 on 2019/3/21 下午10:06
 */
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                queue1.add(i);
            }else {
                queue2.add(i);
            }
        }
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            int r_index = queue1.poll();
            int d_index = queue2.poll();
            if (r_index < d_index) {
                queue1.add(r_index + n);
            } else {
                queue2.add(d_index + n);
            }
        }
        return (queue1.size() > queue2.size()) ? "Radiant" : "Dire";
    }
}