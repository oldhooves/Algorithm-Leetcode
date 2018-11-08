/**
 * 633. 平方数之和
 * https://leetcode-cn.com/problems/sum-of-square-numbers/description/
 * Created by 老蹄子 on 2018/11/8 下午9:06
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        int sqrt = (int)Math.sqrt(c);
        for (int i = 0; i <= sqrt; i++) {
            for (int j = 0; j <= sqrt; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().judgeSquareSum(999999999));
    }
}