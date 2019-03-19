/**
 * 984. 不含 AAA 或 BBB 的字符串
 * https://leetcode-cn.com/classic/problems/string-without-aaa-or-bbb/description/
 * Created by 老蹄子 on 2019/3/19 下午9:02
 */
class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        while (A + B > 0) {
            int l = sb.length();
            if (l > 1 && sb.charAt(l - 2) == sb.charAt(l - 1)) {
                if (sb.charAt(l - 1) == 'a') {
                    sb.append("b");
                    B--;
                } else {
                    sb.append('a');
                    A--;
                }
            } else {
                if (A > B) {
                    sb.append('a');
                    A--;
                } else {
                    sb.append('b');
                    B--;
                }
            }
        }
        return sb.toString();
    }
}
