import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * https://leetcode-cn.com/problems/3sum-closest/description/
 * Created by 老蹄子 on 2018/10/12 下午10:25
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetSum = 0;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int temp_sum = nums[i] + nums[left] + nums[right];
                int temp_diff = Math.abs(temp_sum - target);
                if (temp_diff < diff){
                    closetSum = temp_sum;
                    diff = temp_diff;
                }
                if (temp_sum < target){
                    left++;
                }else if (temp_sum > target){
                    right--;
                }else {
                    return temp_sum;
                }
            }
        }
        return closetSum;
    }
}