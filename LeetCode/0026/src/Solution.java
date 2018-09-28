/**
 * 26. 删除排序数组中的重复项
 * Created by ${laotizi} on 2018-09-28.
 */
class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}