/**
 * 35. 搜索插入位置
 * Created by ${laotizi} on 2018-09-28.
 */
class Solution {

    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;
        while (l <= r){
            if (target == nums[mid]){
                return mid;
            }else if (target > nums[mid]){
                l = mid + 1;
                mid = (l + r) / 2;
            }else {
                r = mid - 1;
                mid = (l + r) / 2;
            }
        }
        return l;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(new Solution().searchInsert(nums,0));
    }
}