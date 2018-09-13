import java.util.Arrays;

/**
 * 455. 分发饼干
 * https://leetcode-cn.com/problems/assign-cookies/description/
 * Created by 老蹄子 on 2018/9/13 下午8:26
 */
class Solution {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int gi = g.length - 1,si = s.length - 1;
        int res = 0;
        while (gi >= 0 && si >= 0){
            if (s[si] >= g[gi]){
                res ++;
                si --;
            }
            gi --;
        }

        return res;
    }

    public static void main(String[] args) {
        int g1[] = {1, 2, 3};
        int s1[] = {1, 1};
        System.out.println((new Solution()).findContentChildren(g1, s1));

        int g2[] = {1, 2};
        int s2[] = {1, 2, 3};
        System.out.println((new Solution()).findContentChildren(g2, s2));
    }
}