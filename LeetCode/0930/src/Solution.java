/**
 * 930. 和相同的二元子数组
 * https://leetcode-cn.com/problems/binary-subarrays-with-sum/description/
 * Created by 老蹄子 on 2019/1/31 下午8:36
 */
class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int psum = 0,res = 0,count[] = new int[A.length + 1];
        count[0] = 1;
        for (int i : A) {
            psum += i;
            if (psum >= S) {
                res += count[psum - S];
            }
            count[psum]++;
        }
        return res;
    }
}
