import java.util.HashSet;
import java.util.Set;

/**
 * 792. 匹配子序列的单词数
 * https://leetcode-cn.com/problems/number-of-matching-subsequences/description/
 * Created by 老蹄子 on 2018/10/17 下午1:28
 */
class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        Set<String> pass = new HashSet<>();
        Set<String> out = new HashSet<>();
        for (String str : words){
            if (pass.contains(str) || out.contains(str)){
                if (pass.contains(str)){
                    count++;
                }
                continue;
            }
            if (isValid(str,S)){
                pass.add(str);
                count++;
            }else {
                out.add(str);
            }
        }
        return count;
    }

    private boolean isValid(String src,String S){
        if (src.length() > S.length()){
            return false;
        }
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            if (j < src.length() && src.charAt(j) == S.charAt(i)){
                j++;
            }
            if (j == src.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(new Solution().numMatchingSubseq("abcde",words));
    }
}