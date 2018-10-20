/**
 * 58. 最后一个单词的长度
 * https://leetcode-cn.com/problems/length-of-last-word/description/
 * Created by 老蹄子 on 2018/10/20 下午10:20
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str.length == 0 ? 0 :str[str.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord(" "));
    }
}