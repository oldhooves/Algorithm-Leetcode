/**
 * 509. 斐波那契数
 https://leetcode-cn.com/problems/fibonacci-number/comments/
 * Created by 老蹄子 on 2019/4/5 下午2:28
 */
class Solution {
    public int fib(int N) {
        if (N < 2) {
            return N;
        }
        int[] res = new int[N];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < N; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[N - 2] + res[N - 1];
    }
}
