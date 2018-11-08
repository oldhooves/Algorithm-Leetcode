/**
 * Created by 老蹄子 on 2018/11/8 下午1:17
 */
public class Solution2 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
