import java.util.Arrays;
import java.util.Comparator;

/**
 * 14. 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 * Created by 老蹄子 on 2018/10/21 下午9:13
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        String res = "";
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < strs[0].length(); i++) {
            if (judge(strs,i,strs[0].charAt(i))){
                res += strs[0].charAt(i);
            }else {
                break;
            }
        }
        return res;
    }

    private boolean judge(String[] strs,int index,char target){
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].charAt(index) != target){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"aca","cba"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }
}
