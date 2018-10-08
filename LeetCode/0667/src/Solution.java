/**
 * 667. 优美的排列 II
 * https://leetcode-cn.com/problems/beautiful-arrangement-ii/description/
 * Created by 老蹄子 on 2018/10/8 下午9:00
 */
class Solution {
    public int[] constructArray(int n, int k) {
        int l = 1;
        int r = k + 1;
        int[] res = new int[n];
        int c = 0;
        while (l <= r){
            res[c++] = l++;
            if (l <= r){
                res[c++] = r--;
            }
        }
        for (int i = k + 2; i <= n; i++) {
            res[c++] = i;
        }
        return res;
    }
}