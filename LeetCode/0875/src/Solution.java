/**
 * 875. 爱吃香蕉的珂珂
 * https://leetcode-cn.com/classic/problems/koko-eating-bananas/description/
 * Created by 老蹄子 on 2019/3/13 下午7:58
 */
class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int l = 1;
        int r = 1000000000;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (!possible(piles, H, mid)) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return l;
    }

    private boolean possible(int[] piles, int H, int K) {
        int time = 0;
        for (int pile : piles) {
            time += (pile - 1) / K + 1;
        }
        return time <= H;
    }
}