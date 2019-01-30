import java.util.HashMap;
import java.util.Map;

/**
 * 961. 重复 N 次的元素
 * https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/description/
 * Created by 老蹄子 on 2019/1/30 下午8:32
 */
class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int a : A) {
            map.put(a,map.getOrDefault(a,0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) != 1) {
                return key;
            }
        }
        return 0;
    }
}
