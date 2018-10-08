/**
 * 153. 寻找旋转排序数组中的最小值
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/description/
 * Created by 老蹄子 on 2018/10/8 下午8:18
 */
class Solution {
    public int findMin(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]){
                return nums[i + 1];
            }
        }
        return nums[0];
    }
}
