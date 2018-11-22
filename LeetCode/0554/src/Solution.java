import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 554. 砖墙
 * https://leetcode-cn.com/problems/brick-wall/description/
 * Created by 老蹄子 on 2018/11/22 下午4:31
 */
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if (wall.size() == 0) {
            return 0;
        }
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (List<Integer> list : wall) {
            int length = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                length += list.get(i);
                map.put(length,map.getOrDefault(length,0) + 1);
                count = Math.max(count,map.get(length));
            }
        }
        return wall.size() - count;
    }
}
