/**
 * Created by 老蹄子 on 2018/11/8 下午1:03
 */
public class Solution3 {
    public boolean isPowerOfThree(int n) {
        double result = Math.log10(n) / Math.log10(3);
        return (result == (int)result) ? true : false;
    }
}
