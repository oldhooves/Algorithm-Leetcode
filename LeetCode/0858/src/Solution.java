/**
 * 858. 镜面反射
 * https://leetcode-cn.com/problems/mirror-reflection/description/
 * Created by 老蹄子 on 2018/11/12 下午7:39
 */
class Solution {
    public int mirrorReflection(int p, int q) {
        while (p % 2 == 0 && q % 2 == 0) {
            p /= 2;
            q /= 2;
        }
        if (p % 2 == 0) {
            return 2;
        } else if (q % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}