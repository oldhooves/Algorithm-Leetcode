/**
 * 414. 第三大的数
 * https://leetcode-cn.com/problems/third-maximum-number/description/
 * Created by ${laotizi} on 2018-09-29.
 */
class Solution {
    public int thirdMax(int[] nums) {

        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        boolean flag = false;

        for (int i = 0; i < len; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] == max){
                continue;
            }
            if (nums[i] >= secondMax){
                secondMax = nums[i];
            }
        }


        for (int i = 0; i < len; i++) {
            if (nums[i] == max){
                continue;
            }
            if (nums[i] == secondMax){
                continue;
            }
            if (nums[i] >= thirdMax){
                thirdMax = nums[i];
                flag = true;
            }
        }
        if (flag){
            return thirdMax;
        }
        return max;
    }
}