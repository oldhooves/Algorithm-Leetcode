/**
 * 343. 整数拆分
 * https://leetcode-cn.com/problems/integer-break/description/
 * Created by 老蹄子 on 2018/9/12 下午9:17
 */
class Solution {

    public int integerBreak(int n) {

        if (n < 1){
            throw new IllegalArgumentException("参数不对");
        }

        int[] memo = new int[n+1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                memo[i] = max3(memo[i],j * (i - j),j * memo[i - j]);
            }
        }
        return memo[n];
    }

    private int max3(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }


    public static void main(String[] args) {
        System.out.println((new Solution()).integerBreak(10));
    }
}
