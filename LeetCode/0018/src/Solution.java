import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 * https://leetcode-cn.com/problems/4sum/description/
 * Created by 老蹄子 on 2018/10/15 下午10:24
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target){
                break;
            }
            if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target){
                continue;
            }
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] >target){
                        break;
                    }
                    if (nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2] < target){
                        continue;
                    }
                    if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])){
                        int left = j + 1;
                        int right = nums.length - 1;
                        int sum = target - nums[i] - nums[j];
                        while (left < right){
                            if (nums[left] + nums[right] == sum){
                                result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                                while (left < right && nums[left] == nums[left + 1]){
                                    left++;
                                }
                                while (left < right && nums[right] == nums[right - 1]){
                                    right--;
                                }
                                left++;
                                right--;
                            }else if (nums[left] + nums[right] > sum){
                                right--;
                            }else {
                                left++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
