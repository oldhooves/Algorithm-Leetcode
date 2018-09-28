import java.util.Arrays;

/**
 * 747. 至少是其他数字两倍的最大数
 * https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/description/
 * Created by 老蹄子 on 2018/9/28 下午8:56
 */
class Solution {

    public int dominantIndex(int[] nums) {

        int[] nums2 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int len = nums.length;
        boolean flag = true;
        for (int i = 0; i < len - 1; i++) {
            if (!(nums[len - 1] >= nums[i] * 2)){
                flag = false;
            }
        }
        if (!flag){
            return -1;
        }else {
            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] == nums[len - 1]){
                    return i;
                }
            }
        }
        return -2;
    }
}
