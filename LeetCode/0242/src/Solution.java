import java.util.Arrays;

/**
 * 242. 有效的字母异位词
 * https://leetcode-cn.com/problems/valid-anagram/description/
 * Created by 老蹄子 on 2018/11/20 下午4:42
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length(),lenT = t.length();
        if (lenS != lenT) {
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        int i = 0;
        while (i < lenS) {
            if (ss[i] != tt[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
