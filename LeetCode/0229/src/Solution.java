import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 229. 求众数 II
 * https://leetcode-cn.com/problems/majority-element-ii/description/
 * Created by 老蹄子 on 2018/10/11 下午2:35
 */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 1){
            result.add(nums[0]);
            return result;
        }
        int temp = 1;
        Arrays.sort(nums);
        int compare = nums.length / 3;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]){
                if (i != nums.length - 2){
                    if (temp > compare){
                        result.add(nums[i]);
                    }
                    temp = 1;
                }else {
                    if (temp > compare){
                        result.add(nums[i]);
                    }
                    temp = 1;
                    if (1 > compare){
                        result.add(nums[nums.length - 1]);
                    }
                }

            }else if (i != nums.length - 2){
                temp++;
            }else {
                temp++;
                if (temp > compare){
                    result.add(nums[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(new Solution().majorityElement(nums));
    }
}
