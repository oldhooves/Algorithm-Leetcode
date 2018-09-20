/**
 * 709. 转换成小写字母
 * https://leetcode-cn.com/problems/to-lower-case/description/
 * Created by 老蹄子 on 2018/9/20 下午10:08
 */
class Solution {

    public String toLowerCase(String str) {

        if (str == null){
            return null;
        }

        char c[] = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] += 32;
            }
        }

        String s = new String(c);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().toLowerCase("PiTAs"));
    }
}
