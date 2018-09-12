import java.util.Arrays;

/**
 * 198. 打家劫舍
 * https://leetcode-cn.com/problems/house-robber/description/
 * Created by 老蹄子 on 2018/9/12 下午9:51
 */
class Solution {

    private int[] memo;

    public int rob(int[] nums) {

        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return tryRob(nums,0);

    }

    private int tryRob(int[] nums,int index){

        if (index >= nums.length){
            return 0;
        }

        if (memo[index] != -1){
            return memo[index];
        }

        int res = 0;
        for (int i = index; i < nums.length; i++) {
            res = Math.max(res,nums[i] + tryRob(nums,i + 2));
        }
        memo[index] = res;
        return res;
    }

    public static void main(String[] args) {

        int nums[] = {2, 1};
        System.out.println((new Solution()).rob(nums));
    }
}