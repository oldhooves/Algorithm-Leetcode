import java.util.Arrays;

/**
 * 581. 最短无序连续子数组
 * https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/description/
 * Created by 老蹄子 on 2018/10/1 下午2:41
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sort = Arrays.copyOf(nums,nums.length);
        Arrays.sort(sort);
        int i =0;
        int j = nums.length - 1;
        while (nums[i] == sort[i] && i < j){
            i++;
        }
        while (nums[j] == sort[j] && i < j){
            j--;
        }
        if (i == j){
            return 0;
        }else {
            return j - i + 1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(new Solution().findUnsortedSubarray(nums));
    }
}