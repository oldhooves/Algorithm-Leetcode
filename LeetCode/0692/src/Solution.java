import java.util.*;

/**
 * 692. 前K个高频单词
 * https://leetcode-cn.com/problems/top-k-frequent-words/description/
 * Created by 老蹄子 on 2018/11/22 下午8:56
 */
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        List<String> candidates = new ArrayList<>(map.keySet());
        Collections.sort(candidates,(w1,w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));
        return candidates.subList(0,k);
    }
}