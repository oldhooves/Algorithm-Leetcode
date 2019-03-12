import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 886. 可能的二分法
 * https://leetcode-cn.com/classic/problems/possible-bipartition/description/
 * Created by ${laotizi} on 2019-03-12.
 */
class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[] color = new int[N + 1];
        List<List<Integer>> adjacent = new ArrayList<List<Integer>>(N + 1);
        for (int i = 0; i <= N; i++) {
            adjacent.add(new ArrayList<Integer>());
        }
        for (int[] d : dislikes) {
            adjacent.get(d[0]).add(d[1]);
            adjacent.get(d[1]).add(d[0]);
        }
        for (int i = 1; i <= N; i++) {
            if (color[i] == 0) {
                color[i] = 1;
                Queue<Integer> q = new LinkedList<Integer>();
                q.add(i);
                while (!q.isEmpty()) {
                    int cur = q.poll();
                    for (int dis : adjacent.get(cur)) {
                        if (color[dis] == 0){
                            color[dis] = color[cur] == 1 ? 2 : 1;
                            q.add(dis);
                        }else {
                            if (color[dis] == color[cur]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}