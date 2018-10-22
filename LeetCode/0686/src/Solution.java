/**
 * 686. 重复叠加字符串匹配
 * https://leetcode-cn.com/problems/repeated-string-match/description/
 * Created by 老蹄子 on 2018/10/22 下午1:42
 */
class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int lenA = A.length();
        int lenB = B.length();
        for (int i = 0; i < lenB / lenA + 2; i++) {
            String str = sb.append(A).toString();
            if (str.indexOf(B) != -1){
                return i + 1;
            }
        }
        return -1;
    }
}
