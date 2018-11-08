/**
 * 168. Excel表列名称
 * https://leetcode-cn.com/problems/excel-sheet-column-title/description/
 * Created by 老蹄子 on 2018/11/8 下午8:50
 */
class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.insert(0,(char)('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(701));
    }
}
