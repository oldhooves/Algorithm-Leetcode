/**
 * 238. 除自身以外数组的乘积
 * https://leetcode-cn.com/problems/product-of-array-except-self/description/
 * Created by 老蹄子 on 2018/10/5 下午4:05
 */
class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] res = new int[nums.length];
        int ans = 1;
        int ans2 = 1;
        for (int i = 0; i < nums.length; i++) {
            ans *= nums[i];
            pre[i] = ans;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans2 *= nums[i];
            post[i] = ans2;
        }
        res[0] = post[1];
        res[nums.length - 1] = pre[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            res[i] = pre[i - 1] * post[i + 1];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = new Solution().productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
