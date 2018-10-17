import java.util.Arrays;

/**
 * 128. 最长连续序列
 * https://leetcode-cn.com/problems/longest-consecutive-sequence/description/
 * Created by 老蹄子 on 2018/10/17 下午2:42
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        int res = 1;
        int temp = 1;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] + 1 == nums[i + 1]){
                temp++;
                res = Math.max(res,temp);
            }else if (nums[i] == nums[i + 1]){
                continue;
            }else {
                temp = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        System.out.println(new Solution().longestConsecutive(nums));
    }
}
