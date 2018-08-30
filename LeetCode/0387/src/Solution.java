/**
 * 387. 字符串中的第一个唯一字符
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/description/
 * Created by 老蹄子 on 2018/8/30 下午10:21
 */
class Solution {
    public int firstUniqChar(String s) {

        int[] frequence = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequence[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequence[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
