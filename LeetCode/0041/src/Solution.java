import java.util.Arrays;

/**
 * 41. 缺失的第一个正数
 * https://leetcode-cn.com/problems/first-missing-positive/description/
 * Created by 老蹄子 on 2018/10/17 下午2:57
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        int res= 0;
        Arrays.sort(nums);

        int firstIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                firstIndex = i;
                break;
            }
        }
        if (firstIndex == -1){
            return 1;
        }
        if (nums[firstIndex] > 1){
            return 1;
        }
        if (firstIndex == nums.length - 1){
            return nums[firstIndex] + 1;
        }
        for (int i = firstIndex; i < nums.length -1; i++) {

            if (nums[i] == nums[i + 1] && i != nums.length - 2){
                continue;
            }else if (nums[i] == nums[i + 1] && i == nums.length - 2){
                return nums[i] + 1;
            }
            if (nums[i] + 1 == nums[i + 1] && i != nums.length - 2){
                continue;
            }else if (nums[i] + 1 == nums[i + 1] && i == nums.length - 2){
                return nums[nums.length - 1] + 1;
            }else {
                res = nums[i] + 1;
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,2,1,1};
        System.out.println(new Solution().firstMissingPositive(nums));
    }
}
