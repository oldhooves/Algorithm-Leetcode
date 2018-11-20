import java.util.Arrays;

/**
 * 389. 找不同
 * https://leetcode-cn.com/problems/find-the-difference/description/
 * Created by 老蹄子 on 2018/11/20 下午2:17
 */
class Solution {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        int i = 0,j = 0;
        while (i < ss.length && j < tt.length) {
            if (ss[i] != tt[j]) {
                break;
            }
            i++;
            j++;
        }
        return tt[j];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findTheDifference("abcd","abcde"));
    }
}
