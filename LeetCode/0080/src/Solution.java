/**
 * 80. 删除排序数组中的重复项 II
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/description/
 * Created by 老蹄子 on 2018/10/8 下午7:47
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2){
            return nums.length;
        }

        boolean isTwice = false;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && nums[i] == nums[i + 1]){
                if (!isTwice){
                    isTwice = true;
                    nums[len++] = nums[i];
                }
            }else {
                isTwice = false;
                nums[len++] = nums[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
