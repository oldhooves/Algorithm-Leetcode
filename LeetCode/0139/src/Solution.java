import java.util.List;

/**
 * 139. 单词拆分
 * https://leetcode-cn.com/classic/problems/word-break/description/
 * Created by 老蹄子 on 2019/3/24 下午7:03
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && wordDict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
}