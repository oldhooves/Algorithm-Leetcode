import java.util.HashMap;
import java.util.Map;

/**
 * 409. 最长回文串
 * https://leetcode-cn.com/problems/longest-palindrome/description/
 * Created by 老蹄子 on 2018/11/20 下午3:43
 */
class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        boolean flag = false; //是否存在个数为1的字符，eg."bb"不存在
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for (char c : map.keySet()) {
            int temp = map.get(c);
            if (temp % 2 == 0) {
                res += temp;
            }else {
                res += (temp - 1);
                flag = true;
            }
        }
        return flag == true ? res + 1 : res;
    }

}
