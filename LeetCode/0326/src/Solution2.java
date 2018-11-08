/**
 * Created by 老蹄子 on 2018/11/8 下午12:59
 */
public class Solution2 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
