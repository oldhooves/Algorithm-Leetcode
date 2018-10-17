import java.util.ArrayList;
import java.util.List;

/**
 * 557. 反转字符串中的单词 III
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/description/
 * Created by 老蹄子 on 2018/10/17 下午5:19
 */
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words){
            res.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
    /*public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String res = "";
        int len = strs.length;
        for (int i = 0; i < len - 1; i++) {
            res += reverse(strs[i]) + " ";
        }
        res += reverse(strs[len - 1]);
        return res;
    }

    public String reverse(String str) {
        String result = "";
        int len = str.length();
        for (int i = 0; i < len; i++)
            result = str.charAt(i) + result;
        return result;
    }*/

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new Solution().reverseWords(s));
    }
}
