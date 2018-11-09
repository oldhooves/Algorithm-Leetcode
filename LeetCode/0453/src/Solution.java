import java.util.Arrays;

/**
 * 453. 最小移动次数使数组元素相等
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/description/
 * Created by 老蹄子 on 2018/11/9 下午1:42
 */
class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        Arrays.sort(nums);
        return sum - n * nums[0];
    }
}
