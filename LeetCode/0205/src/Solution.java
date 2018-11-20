import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 205. 同构字符串
 * https://leetcode-cn.com/problems/isomorphic-strings/description/
 * Created by 老蹄子 on 2018/11/20 下午7:18
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set=new HashSet<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if (map.containsKey(ss[i])) {
                if (map.get(ss[i]) != tt[i]) {
                    return false;
                }
            }else {
                if (set.contains(tt[i])) {
                    return false;
                }
                map.put(ss[i],tt[i]);
                set.add(tt[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("ab","aa"));
    }
}
