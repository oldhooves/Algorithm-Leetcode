import java.util.HashSet;
import java.util.Set;

/**
 * 873. 最长的斐波那契子序列的长度
 * https://leetcode-cn.com/problems/length-of-longest-fibonacci-subsequence/description/
 * Created by 老蹄子 on 2018/10/14 下午8:09
 */
class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int x : A){
            set.add(x);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int x = A[j];
                int y = A[i] + A[j];
                int length = 2;
                while (set.contains(y)){
                    int temp = y;
                    y += x;
                    x = temp;
                    ans = Math.max(ans,++length);
                }
            }
        }
        return ans >= 3 ? ans : 0;
    }
}
