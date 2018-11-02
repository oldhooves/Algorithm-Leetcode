import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 893. 特殊等价字符串组
 * https://leetcode-cn.com/problems/groups-of-special-equivalent-strings/description/
 * Created by 老蹄子 on 2018/11/2 下午4:41
 */
class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1){
                    odd[s.charAt(i) - 'a']++;
                }else {
                    even[s.charAt(i) - 'a']++;
                }
            }
            String sig = Arrays.toString(odd) + Arrays.toString(even);
            set.add(sig);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] A = {"abc","acb","bac","bca","cab","cba"};
        System.out.println(new Solution().numSpecialEquivGroups(A));
    }
}