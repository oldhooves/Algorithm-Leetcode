/**
 * 134. 加油站
 * https://leetcode-cn.com/classic/problems/gas-station/description/
 * Created by 老蹄子 on 2019/3/20 下午8:18
 */
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        for(int i = 0; i < gas.length; i++)
            tank += gas[i] - cost[i];
        if(tank < 0)
            return - 1;

        int start = 0;
        int accumulate = 0;
        for(int i = 0; i < gas.length; i++){
            int curGain = gas[i] - cost[i];
            if(accumulate + curGain < 0){
                start = i + 1;
                accumulate = 0;
            }
            else accumulate += curGain;
        }

        return start;
    }
}
