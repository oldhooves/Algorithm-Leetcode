import java.util.HashMap;
import java.util.Map;

/**
 * 781. 森林中的兔子
 * https://leetcode-cn.com/problems/rabbits-in-forest/description/
 * Created by 老蹄子 on 2018/11/22 下午3:04
 */
class Solution {
    public int numRabbits(int[] answers) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int answer : answers) {
            map.put(answer,map.getOrDefault(answer,0) + 1);
        }
        for (Integer n : map.keySet()) {
            int group = map.get(n) / (n + 1);
            res += map.get(n) % (n + 1) != 0 ? (group + 1) * (n + 1) : group * (n + 1);
        }
        return res;
    }
}
