import sun.java2d.pipe.SolidTextRenderer;

import java.util.ArrayList;
import java.util.List;

/**
 * 816. 模糊坐标
 * https://leetcode-cn.com/problems/ambiguous-coordinates/description/
 * Created by 老蹄子 on 2018/10/23 下午3:47
 */
class Solution {
    public List<String> ambiguousCoordinates(String S) {
        List<String> res = new ArrayList<>();
        S = S.substring(1,S.length() - 1);
        for (int i = 1; i < S.length(); i++) {
            List<String> res1 = helper(S.substring(0,i));
            List<String> res2 = helper(S.substring(i));
            if (res1.size() == 0 || res2.size() == 0){
                continue;
            }
            for (String s1 : res1){
                for (String s2 : res2){
                    res.add("(" + s1 + ", " + s2 + ")");
                }
            }
        }
        return res;
    }

    private List<String> helper(String s){
        List<String> res = new ArrayList<>();
        if (s.length() == 0){
            return res;
        }
        if (s.length() == 1 || s.charAt(0) != '0' && s.charAt(s.length() - 1) == '0'){
            res.add(s);
            return res;
        }
        if (s.charAt(0) == '0' && s.charAt(s.length() - 1) == '0'){
            return res;
        }
        if (s.charAt(0) == '0'){
            res.add(s.substring(0,1) + "." + s.substring(1,s.length()));
            return res;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            res.add(s.substring(0,i + 1) + "." + s.substring(i + 1,s.length()));
        }
        res.add(s);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().ambiguousCoordinates("(100)"));
    }
}