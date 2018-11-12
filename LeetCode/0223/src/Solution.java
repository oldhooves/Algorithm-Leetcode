/**
 * 223. 矩形面积
 * https://leetcode-cn.com/problems/rectangle-area/description/
 * Created by 老蹄子 on 2018/11/12 下午7:19
 */
class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C - A) * (D - B);
        int areaB = (G - E) * (H - F);

        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int bottom = Math.max(B,F);
        int top = Math.min(D,H);

        int overlap = 0;
        if (right > left && top > bottom) {
            overlap = (right - left) * (top - bottom);
        }

        return areaA + areaB - overlap;
    }
}
