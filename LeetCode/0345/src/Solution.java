/**
 * 345. 反转字符串中的元音字母
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 * Created by 老蹄子 on 2018/10/18 下午8:17
 */
class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j){
            while (i < j && !vowels.contains(ch[i] + "")){
                i++;
            }
            while (i < j && !vowels.contains(ch[j] + "")){
                j--;
            }
            if (i < j){
                char c = ch[i];
                ch[i++] = ch[j];
                ch[j--] = c;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("hello"));
    }
}