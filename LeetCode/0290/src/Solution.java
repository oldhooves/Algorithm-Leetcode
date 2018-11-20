import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 290. 单词模式
 * https://leetcode-cn.com/problems/word-pattern/description/
 * Created by 老蹄子 on 2018/11/20 下午9:53
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        char[] chars = pattern.toCharArray();
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        if (strs.length != chars.length) {
            return false;
        }
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(chars[i])) {
                if (set.contains(strs[i])) {
                    return false;
                }
                map.put(chars[i],strs[i]);
                set.add(strs[i]);
            }else {
                if (!map.get(chars[i]).equals(strs[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().wordPattern("abba","dog dog dog dog"));
    }
}
