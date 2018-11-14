/**
 * 866. 回文素数
 * https://leetcode-cn.com/problems/prime-palindrome/description/
 * Created by 老蹄子 on 2018/11/14 下午8:43
 */
class Solution {
    public int primePalindrome(int N) {
        while (true) {
            if (N == reverse(N) && isPrime(N)) {
                return N;
            }
            N++;
            //8位数的回文数不是素数
            if (N > 10000000 && N < 100000000) {
                N = 100000000;
            }
        }
    }

    private boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        int r = (int)Math.sqrt(N);
        for (int i = 2; i <= r; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int reverse(int N) {
        int ans = 0;
        while (N > 0) {
            ans = 10 * ans + (N % 10);
            N /= 10;
        }
        return ans;
    }
}
