/**
 * 767. 重构字符串
 * https://leetcode-cn.com/problems/reorganize-string/description/
 * Created by 老蹄子 on 2018/10/24 下午9:05
 */
class Solution {
    public String reorganizeString(String S) {
        int len = S.length();
        char[] ch = new char[26];
        int max = 0;
        for (char c : S.toCharArray()){
            ch[c - 'a']++;
            if (ch[c - 'a'] > ch[max]){
                max = c - 'a';
            }
        }

        if (len < 2 * ch[max] - 1){
            return "";
        }
        int index = 0;
        char[] res = new char[len];
        for (int i = 0; i < ch[max]; i++) {
            res[index] = (char)(max + 'a');
            index += 2;
        }
        ch[max] = 0;
        for (int i = 0; i < 26; i++) {
            int count = ch[i];
            while (count > 0){
                if (index >= len){
                    index = 1;
                }
                res[index] = (char)(i + 'a');
                index += 2;
                count--;
            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reorganizeString("aab"));
    }
}
