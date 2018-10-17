/**
 * 154. 寻找旋转排序数组中的最小值 II
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
 * Created by 老蹄子 on 2018/10/17 下午4:09
 */
class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]){
                res = nums[i + 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(new Solution().findMin(nums));
    }
}
