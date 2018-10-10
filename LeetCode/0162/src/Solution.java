/**
 * 162. 寻找峰值
 * https://leetcode-cn.com/problems/find-peak-element/description/
 * Created by 老蹄子 on 2018/10/9 下午10:00
 */
class Solution {
    public int findPeakElement(int[] nums) {

        if (nums == null || nums.length == 0){
            return -1;
        }
        if (nums.length == 1){
            return 0;
        }
        if (nums[0] > nums[1]){
            return 0;
        }
        if (nums[nums.length - 2] < nums[nums.length - 1]){
            return nums.length -1 ;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                return i;
            }
        }
        return -1;
    }
}
