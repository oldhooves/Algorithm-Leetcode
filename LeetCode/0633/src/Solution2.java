/**
 * Created by 老蹄子 on 2018/11/8 下午9:19
 */
public class Solution2 {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
