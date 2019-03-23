/**
 * 338. 比特位计数
 * https://leetcode-cn.com/classic/problems/counting-bits/description/
 * Created by 老蹄子 on 2019/3/23 下午5:51
 */
class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            res[i] = res[i / 2] + i % 2;
        }
        return res;
    }
}