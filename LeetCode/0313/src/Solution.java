/**
 * 313. 超级丑数
 * https://leetcode-cn.com/problems/super-ugly-number/description/
 * Created by 老蹄子 on 2018/11/9 下午3:44
 */
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n + 1];
        ugly[0] = 1;
        int[] pointer = new int[primes.length];
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < primes.length; j++) {
                if (ugly[pointer[j]] * primes[j] < min) {
                    min = ugly[pointer[j]] * primes[j];
                    minIndex = j;
                } else if (ugly[pointer[j]] * primes[j] == min) {
                    pointer[j]++;
                }
            }
            ugly[i] = min;
            pointer[minIndex]++;
        }
        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int[] primes = {2,7,13,19};
        System.out.println(new Solution().nthSuperUglyNumber(10,primes));
    }
}