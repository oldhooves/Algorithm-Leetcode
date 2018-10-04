/**
 * 287. 寻找重复数
 * https://leetcode-cn.com/problems/find-the-duplicate-number/description/
 * Created by 老蹄子 on 2018/10/4 下午9:42
 */
class Solution {
    public int findDuplicate(int[] nums) {

        int high = nums.length - 1;
        int low = 0;

        while (high > low){
            int mid = (high + low) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid){
                    count++;
                }
            }
            if (count > mid){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(new Solution().findDuplicate(nums));
    }
}
