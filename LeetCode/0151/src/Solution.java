/**
 * 151. 翻转字符串里的单词
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/description/
 * Created by 老蹄子 on 2018/10/21 下午10:15
 */
public class Solution {
    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            if (i == 0){
                result.append(wordsArray[i]);
            }else {
                result.append(wordsArray[i] + " ");
            }
        }
        return result.toString();
    }
}
