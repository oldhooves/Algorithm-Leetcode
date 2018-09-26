/**
 * Created by 老蹄子 on 2018/9/26 下午10:09
 */
public class Solution2 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int allSum = len * (len+1) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return allSum - sum;
    }
}
