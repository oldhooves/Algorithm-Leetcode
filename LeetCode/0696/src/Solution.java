/**
 * 696. 计数二进制子串
 * https://leetcode-cn.com/problems/count-binary-substrings/description/
 * Created by 老蹄子 on 2018/10/18 下午7:18
 */
class Solution {
    public int countBinarySubstrings(String s) {
        int len = s.length();
        if (len <= 1){
            return 0;
        }
        char[] ch = s.toCharArray();
        int[] count = new int[len];
        int temp = 0;
        for (int i = 0; i < len - 1; i++) {
            count[temp]++;
            if (ch[i] != ch[i + 1]){
                temp++;
            }
        }
        if (ch[len - 1] == ch[len - 2]){
            count[temp]++;
        }else {
            count[temp]++;
        }

        int res = 0;
        for (int i = 0; i < temp; i++) {
            res += Math.min(count[i],count[i + 1]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countBinarySubstrings("10101"));
    }
}
