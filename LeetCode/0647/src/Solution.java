/**
 * 647. 回文子串
 * https://leetcode-cn.com/problems/palindromic-substrings/description/
 * Created by 老蹄子 on 2018/10/23 上午10:32
 */
class Solution {
    public int countSubstrings(String s) {
        if (s == null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (judge(i,j,s)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean judge(int start,int end,String s){
        while (start <= end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countSubstrings("aaa"));
    }
}
