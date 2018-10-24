/**
 * 831. 隐藏个人信息
 * https://leetcode-cn.com/problems/masking-personal-information/description/
 * Created by 老蹄子 on 2018/10/24 下午2:31
 */
class Solution {
    public String maskPII(String S) {
        int atIndex = S.indexOf('@');
        if (atIndex >= 0){
            return (S.substring(0,1) + "*****" + S.substring(atIndex - 1)).toLowerCase();
        }
        else {
            String digits = S.replaceAll("\\D+","");
            String local = "***-***-" + digits.substring(digits.length() - 4);
            if (digits.length() == 10){
                return local;
            }
            String ans = "+";
            for (int i = 0; i < digits.length() - 10; i++) {
                ans += "*";
            }
            return ans + "-" + local;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maskPII("AB@qq.com"));
    }
}