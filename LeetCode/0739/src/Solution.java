/**
 * 739. 每日温度
 * https://leetcode-cn.com/problems/daily-temperatures/description/
 * Created by 老蹄子 on 2018/11/21 下午5:08
 */
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            res[i] = helper(temperatures,i);
        }
        return res;
    }

    private int helper(int[] temperatures, int index) {
        for (int i = index + 1; i < temperatures.length; i++) {
            if (temperatures[i] > temperatures[index]) {
                return i - index;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(new Solution().dailyTemperatures(temperatures).toString());
    }
}
