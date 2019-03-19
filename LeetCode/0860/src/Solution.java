/**
 * 860. 柠檬水找零
 * https://leetcode-cn.com/classic/problems/lemonade-change/description/
 * Created by 老蹄子 on 2019/3/19 下午7:51
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                five--;
                ten++;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}
