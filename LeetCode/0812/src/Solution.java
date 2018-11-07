/**
 * 812. 最大三角形面积
 * https://leetcode-cn.com/problems/largest-triangle-area/description/
 * Created by 老蹄子 on 2018/11/7 下午7:35
 */
class Solution {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int[] i : points) {
            for (int[] j : points) {
                for (int[] k : points) {
                    res = Math.max(res,0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1] - j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
                }
            }
        }
        return res;
    }
}