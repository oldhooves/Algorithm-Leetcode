import java.util.Arrays;

/**
 * Created by 老蹄子 on 2018/11/12 下午3:04
 * 与中位数的差的绝对值的和
 */
public class Solution2 {
    public int minMoves2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i] - mid);
        }
        return sum;
    }
}
