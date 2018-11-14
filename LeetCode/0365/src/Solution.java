/**
 * 365. 水壶问题
 * https://leetcode-cn.com/problems/water-and-jug-problem/description/
 * Created by 老蹄子 on 2018/11/14 下午4:10
 */
class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == z || y == z || x + y == z) {
            return true;
        }
        return z % gcd(x,y) == 0;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
