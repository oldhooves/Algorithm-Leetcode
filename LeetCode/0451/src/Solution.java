import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 451. 根据字符出现频率排序
 * https://leetcode-cn.com/problems/sort-characters-by-frequency/description/
 * Created by 老蹄子 on 2018/11/21 下午4:37
 */
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int) e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}