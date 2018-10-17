/**
 * 521. 最长特殊序列 Ⅰ
 * https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/description/
 * Created by 老蹄子 on 2018/10/17 下午8:47
 */
class Solution {
    public int findLUSlength(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (a.equals(b)){
            return -1;
        }else {
            return Math.max(lenA,lenB);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findLUSlength("aba","cdc"));
    }
}
