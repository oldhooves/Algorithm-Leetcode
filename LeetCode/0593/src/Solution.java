import java.util.HashMap;
import java.util.Map;

/**
 * 593. 有效的正方形
 * https://leetcode-cn.com/problems/valid-square/description/
 * Created by 老蹄子 on 2018/11/12 下午8:36
 */
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dis = new int[]{distance(p1,p2),distance(p1,p3),
                distance(p1,p4),distance(p2,p3),distance(p2,p4),distance(p3,p4)};
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int distance : dis) {
            max = Math.max(max, distance);
            if (!map.containsKey(distance)) {
                map.put(distance,1);
            }else {
                map.put(distance,map.get(distance) + 1);
            }
        }
        return map.get(max) == 2 && map.size() == 2;
    }

    private int distance(int[] p1, int[] p2) {
        return (p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]);
    }
}