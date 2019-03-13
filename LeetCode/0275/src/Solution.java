/**
 * 275. H指数 II
 * https://leetcode-cn.com/classic/problems/h-index-ii/description/
 * Created by 老蹄子 on 2019/3/13 下午7:33
 */
class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int lo = 0, hi = len - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (citations[mid] == len - mid) {
                return len - mid;
            } else if (citations[mid] < len - mid) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return len - lo;
    }
}