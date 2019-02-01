/**
 * 953. 验证外星语词典
 * https://leetcode-cn.com/problems/verifying-an-alien-dictionary/description/
 * Created by 老蹄子 on 2019/2/1 下午3:34
 */
class Solution {

    int[] mapping = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            if (compare(words[i - 1], words[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    private int compare(String s1, String s2) {
        int n = s1.length(),m = s2.length(),cmp = 0;
        for (int i = 0, j = 0; i < n && j < m && cmp == 0; i++, j++) {
            cmp = mapping[s1.charAt(i) - 'a'] - mapping[s2.charAt(j) - 'a'];
        }
        return cmp == 0 ? n - m : cmp;
    }
}
