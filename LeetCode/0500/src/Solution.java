import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 500. 键盘行
 * https://leetcode-cn.com/problems/keyboard-row/description/
 * Created by 老蹄子 on 2018/11/19 下午8:07
 */
class Solution {
    public String[] findWords(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                map.put(c,i);
            }
        }
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int index = map.get(word.toUpperCase().charAt(0));
            for (char c : word.toUpperCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
