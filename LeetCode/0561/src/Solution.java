import java.util.Arrays;

/**
 * 561. 数组拆分 I
 * https://leetcode-cn.com/problems/array-partition-i/description/
 * Created by 老蹄子 on 2018/9/21 下午10:36
 */
class Solution {

    public int arrayPairSum(int[] nums) {

        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                res += nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        int res = new Solution().arrayPairSum(nums);
        System.out.println(res);
    }
}
