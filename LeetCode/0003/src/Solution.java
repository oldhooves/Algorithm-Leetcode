/**
 * 3. 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 * Created by 老蹄子 on 2018/9/3 下午9:57
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] frequence = new int[256];
        int l = 0,r = -1; //滑动窗口为[l,r]
        int res = 0;

        while (l < s.length()){

            if (r + 1 < s.length() && frequence[s.charAt(r+1)] ==0){
                r++;
                frequence[s.charAt(r)]  ++;
            }
            else {

                frequence[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res,r-l+1);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println((new Solution()).lengthOfLongestSubstring( "abcabcbb" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "bbbbb" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "pwwkew" ));
    }
}
