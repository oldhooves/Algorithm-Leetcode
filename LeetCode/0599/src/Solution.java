import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 599. 两个列表的最小索引总和
 * https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/description/
 * Created by 老蹄子 on 2018/11/20 下午5:00
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> list1Map = new HashMap<>();
        Map<String,Integer> list2Map = new HashMap<>();
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i],i);
        }
        for (int i = 0; i < list2.length; i++) {
            list2Map.put(list2[i],i);
        }
        for (String word : list1) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for (String word : list2) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for (String word : map.keySet()) {
            if (map.get(word) != 1) {
                list.add(word);
            }
        }
        int temp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (res > list1Map.get(list.get(i)) + list2Map.get(list.get(i))) {
                res = list1Map.get(list.get(i)) + list2Map.get(list.get(i));
                temp = i;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (res == list1Map.get(list.get(i)) + list2Map.get(list.get(i))) {
                ans.add(list.get(i));
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
