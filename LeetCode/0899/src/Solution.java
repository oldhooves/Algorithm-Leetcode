import java.util.Arrays;

/**
 * 899. 有序队列
 * https://leetcode-cn.com/problems/orderly-queue/description/
 * Created by 老蹄子 on 2018/10/31 下午7:46
 * 当 K > 1 时， 可以生成当前字符串的任意序列。因此将原字符串排序生成字典序最小的序列。
 */
class Solution {
    public String orderlyQueue(String S, int K) {
        if (K > 1) {
            char[] c = S.toCharArray();
            Arrays.sort(c);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c.length; i++) {
                sb.append(c[i]);
            }
            return sb.toString();
        }

        String res = S;
        int len = S.length();
        S = S + S;
        for (int i = 0; i < len; i++) {
            if (res.compareTo(S.substring(i, i + len)) > 0) {
                res = S.substring(i,i + len);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().orderlyQueue("baaca",3));
    }
}
