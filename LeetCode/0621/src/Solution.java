import java.util.Arrays;

/**
 * 621. 任务调度器
 * https://leetcode-cn.com/problems/task-scheduler/description/
 * Created by 老蹄子 on 2018/10/9 下午4:20
 */
class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] c = new int[26];

        for (char t : tasks){
            c[t - 'A']++;
        }
        Arrays.sort(c);

        int same = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == c[25]){
                same++;
            }
        }
        return Math.max(tasks.length,(c[25] - 1) * (n + 1) + same);
    }
}
