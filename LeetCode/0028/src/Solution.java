/**
 * 28. 实现strStr()
 * https://leetcode-cn.com/problems/implement-strstr/description/
 * Created by 老蹄子 on 2018/10/19 下午2:54
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int len_haystack = haystack.length();
        int len_needle = needle.length();
        int n1 = 0;
        int h1 = 0;
        while (h1 + len_needle <= len_haystack){
            int k = h1;
            while (n1 < len_needle && haystack.charAt(k) == needle.charAt(n1)){
                n1++;
                k++;
            }
            if (n1 == len_needle){
                return h1;
            }
            n1 = 0;
            h1++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strStr("hello","ll"));
    }
}
