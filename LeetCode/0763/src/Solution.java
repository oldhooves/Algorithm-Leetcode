import java.util.ArrayList;
import java.util.List;

/**
 * 763. 划分字母区间
 * https://leetcode-cn.com/classic/problems/partition-labels/description/
 * Created by ${laotizi} on 2019-03-20.
 */
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        int j = 0,anchor = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j,last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}