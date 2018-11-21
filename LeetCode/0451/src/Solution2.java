import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 老蹄子 on 2018/11/21 下午4:55
 */
public class Solution2 {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        List<Character>[] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--) {
            if (bucket[pos] != null) {
                for (char c : bucket[pos]) {
                    for (int i = 0; i < map.get(c); i++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
