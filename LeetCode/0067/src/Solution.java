/**
 * 67. 二进制求和
 * https://leetcode-cn.com/problems/add-binary/description/
 * Created by 老蹄子 on 2018/10/18 下午8:00
 */
class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int c = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        while (i >= 0 || j >= 0 || c == 1){
            c += i >= 0 ? ca[i--] - '0' : 0;
            c += j >= 0 ? cb[j--] - '0' : 0;
            result = (char)(c % 2 + '0') + result;
            c /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11","1"));
    }
}
