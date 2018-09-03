/**
 * 209. 长度最小的子数组
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/description/
 * Created by 老蹄子 on 2018/9/3 下午2:03
 */
class Solution {
    public int minSubArrayLen(int s, int[] nums) {

        int l =0,r = -1; //nums[l,r]为滑动窗口
        int sum = 0;
        int res = nums.length+1;
        while (l < nums.length){
            if (sum < s && r+1 < nums.length){
                r++;
                sum+=nums[r];
            }
            //r已经到头 或者 sum >= s
            else {
                sum-=nums[l];
                l++;
            }
            if (sum >= s){
                res = Math.min(res,r-l+1);
            }
        }
        if (res == nums.length+1){
            return 0;
        }
        return res;

    }

}