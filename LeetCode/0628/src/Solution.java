import java.util.Arrays;

/**
 * Created by 老蹄子 on 2018/9/28 下午7:49
 */
class Solution {

    public int maximumProduct(int[] nums) {

        int len = nums.length;
        Arrays.sort(nums);
        if (nums[len - 1] < 0){
            return nums[len-1]*nums[len-2]*nums[len-3];
        }
        int res1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int res2 = nums[0] * nums[1] * nums[len - 1];
        return Math.max(res1,res2);
    }
}
