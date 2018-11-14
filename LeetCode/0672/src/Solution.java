/**
 * 672. 灯泡开关 Ⅱ
 * https://leetcode-cn.com/problems/bulb-switcher-ii/description/
 * Created by 老蹄子 on 2018/11/14 下午9:49
 */
class Solution {
    public int flipLights(int n, int m) {
        if(m==0) return 1;
        if(n==1) return 2;
        if(n==2&&m==1) return 3;
        if(n==2) return 4;
        if(m==1) return 4;
        if(m==2) return 7;
        if(m>=3) return 8;
        return 8;
    }
}