/**
 * Created by 老蹄子 on 2018/11/7 下午9:09
 */
public class Solution2 {
    public static boolean isPowerOfTwo(int n) {
        int count = 0;
        double temp = 0;
        while (true) {
            temp = Math.pow(2, count);
            if (n == temp) {
                return true;
            }
            if (n < temp) {
                return false;
            }
            count += 1;
        }
    }
}
