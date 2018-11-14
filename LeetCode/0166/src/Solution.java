import java.util.HashMap;

/**
 * 166. 分数到小数
 * https://leetcode-cn.com/problems/fraction-to-recurring-decimal/description/
 * Created by 老蹄子 on 2018/11/14 下午5:08
 */
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        res.append((numerator > 0) ^ (denominator > 0) ? "-" : "");
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }

        res.append(".");
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(num,res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index,"(");
                res.append(")");
                break;
            }
            else {
                map.put(num,res.length());
            }
        }
        return res.toString();

    }
}