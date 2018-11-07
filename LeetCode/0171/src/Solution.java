/**
 * 171. Excel表列序号
 * https://leetcode-cn.com/problems/excel-sheet-column-number/description/
 * Created by 老蹄子 on 2018/11/7 下午4:35
 */
class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("ABC"));
    }
}
