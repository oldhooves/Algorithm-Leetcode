/**
 * 372. 超级次方
 * https://leetcode-cn.com/problems/super-pow/description/
 * Created by 老蹄子 on 2018/11/13 下午5:18
 */
class Solution {

    private static final int M = 1337;

    public int superPow(int a, int[] b) {
        a %= M;
        int result = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            result = result * normalPow(a,b[i]) % M;
            a = normalPow(a,10);
        }
        return result;
    }

    private int normalPow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a % M;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] b = {2,0,0};
        System.out.println(new Solution().superPow(2147483647,b));
    }
}
