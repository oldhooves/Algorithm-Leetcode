import java.util.HashMap;
import java.util.Map;

/**
 * 771. 宝石与石头
 * https://leetcode-cn.com/problems/jewels-and-stones/description/
 * Created by 老蹄子 on 2018/11/19 下午8:01
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i),1);
        }
        char[] chars = S.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numJewelsInStones("aA","aAAbbbb"));
    }
}