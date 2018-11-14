import java.util.HashSet;
import java.util.Set;

/**
 * 829. 连续整数求和
 * https://leetcode-cn.com/problems/consecutive-numbers-sum/description/
 * Created by 老蹄子 on 2018/11/14 下午7:09
 */
class Solution {
    public int consecutiveNumbersSum(int N) {
        int ans = 1;
        for (int i = 2; i * (i + 1) / 2 <= N; i++) {
            if ((N - i * (i + 1) / 2) % i == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().consecutiveNumbersSum(15));
    }
}