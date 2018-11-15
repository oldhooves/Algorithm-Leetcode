import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;

/**
 * 149. 直线上最多的点数
 * https://leetcode-cn.com/problems/max-points-on-a-line/description/
 * Created by 老蹄子 on 2018/11/15 下午3:36
 */
class Solution {

    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public int maxPoints(Point[] points) {
        if (points.length <= 0) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<BigDecimal,Integer> map = new HashMap<>();
            int sameX = 1;
            int samePoint = 0;
            int x1 = points[i].x;
            int y1 = points[i].y;
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int x2 = points[j].x;
                    int y2 = points[j].y;
                    if (x2 == x1 && y2 == y1) {
                        samePoint++;
                    }
                    if (x2 == x1) {
                        sameX++;
                        continue;
                    }
                    //double类型的斜率有个测试用例通不过
                    BigDecimal slope = new BigDecimal(y2 - y1).divide(new BigDecimal(x2 - x1),MathContext.DECIMAL64);
                    if (map.containsKey(slope)) {
                        map.put(slope, map.get(slope) + 1);
                    } else {
                        map.put(slope,2);
                    }
                    result = Math.max(result,map.get(slope) + samePoint);
                }
            }
            result = Math.max(result,sameX);
        }
        return result;
    }
}
