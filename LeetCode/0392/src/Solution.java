/**
 * 392. 判断子序列
 * https://leetcode-cn.com/classic/problems/is-subsequence/description/
 * Created by ${laotizi} on 2019-03-13.
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int indexS = 0,indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) {
                    return true;
                }
            }
            indexT++;
        }
        return false;
    }
}