import java.util.HashSet;

/**
 * 202. 快乐数
 * https://leetcode-cn.com/problems/happy-number/description/
 * Created by 老蹄子 on 2018/11/7 下午8:08
 */
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            int result = 0;
            while (n != 0) {
                result += Math.pow(n % 10,2);
                n /= 10;
            }
            if (set.contains(result)) {
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;
    }
}
