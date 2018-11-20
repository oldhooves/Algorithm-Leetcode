import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 594. 最长和谐子序列
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/description/
 * Created by 老蹄子 on 2018/11/20 下午9:17
 */
class Solution {
    public int findLHS(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       int res = 0;
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                res = Math.max(res,map.get(key) + map.get(key + 1));
            }
        }
        return res;
    }
}