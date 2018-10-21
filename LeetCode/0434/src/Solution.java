/**
 * 434. 字符串中的单词数
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/description/
 * Created by 老蹄子 on 2018/10/21 下午8:57
 */
class Solution {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countSegments(", , , ,        a, eaefa"));
    }
}
