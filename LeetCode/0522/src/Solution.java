import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * 522. 最长特殊序列 II
 * https://leetcode-cn.com/problems/longest-uncommon-subsequence-ii/description/
 * Created by 老蹄子 on 2018/10/24 下午9:23
 */
class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Set<String> duplicates = getDuplicates(strs);
        for (int i = 0; i < strs.length; i++) {
            if (!duplicates.contains(strs[i])){
                if (i == 0){
                    return strs[0].length();
                }
                for (int j = 0; j < i; j++) {
                    if (isSubsequence(strs[j],strs[i])){
                        break;
                    }
                    if (j == i - 1){
                        return strs[i].length();
                    }
                }
            }
        }
        return -1;
    }

    private boolean isSubsequence(String a,String b){
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()){
            if (a.charAt(i) == b.charAt(j)){
                j++;
            }
            i++;
        }
        return j == b.length();
    }

    private Set<String> getDuplicates(String[] strs){
        Set<String> set = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String s : strs){
            if (set.contains(s)){
                duplicates.add(s);
            }
            set.add(s);
        }
        return duplicates;
    }
}
