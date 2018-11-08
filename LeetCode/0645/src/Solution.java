import java.util.Arrays;

/**
 * 645. 错误的集合
 * https://leetcode-cn.com/problems/set-mismatch/description/
 * Created by 老蹄子 on 2018/11/8 下午7:19
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = 0;
        int lose;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        lose = n * (n + 1) / 2 - sum + duplicate;
        return new int[]{duplicate,lose};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(new Solution().findErrorNums(nums).toString());
    }
}
