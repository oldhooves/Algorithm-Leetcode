import java.util.HashMap;

/**
 * 13. 罗马数字转整数
 * https://leetcode-cn.com/problems/roman-to-integer/description/
 * Created by 老蹄子 on 2018/10/18 下午1:16
 */
class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() < 1){
            return -1;
        }
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        int temp = 0;
        int value = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            value = map.get(ch[i]);
            if (temp <= value){
                res += value;
                temp = value;
            }else {
                res -= value;
                temp = value;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}
