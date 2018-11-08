/**
 * 204. 计数质数
 * https://leetcode-cn.com/problems/count-primes/description/
 * Created by 老蹄子 on 2018/11/8 下午9:29
 */
class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(1500000));
    }
}