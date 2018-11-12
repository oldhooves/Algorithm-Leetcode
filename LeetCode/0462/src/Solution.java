import java.util.Arrays;

/**
 * 462. 最少移动次数使数组元素相等 II
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements-ii/description/
 * Created by 老蹄子 on 2018/11/12 下午2:20
 */
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long min = Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min,helper(nums,nums[i]));
        }
        return (int)min;
    }

    private long helper(int[] nums, int target) {
        long sum = 0;
        for (int num : nums) {
            sum += Math.abs(num - target);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        System.out.println(new Solution().minMoves2(nums));
    }
}