import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 884. 两句话中的不常见单词
 * https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/description/
 * Created by 老蹄子 on 2018/11/20 下午3:14
 */
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : A.split(" ")) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for (String word : B.split(" ")) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().uncommonFromSentences("s z z z s","s z ejt"));
    }
}
