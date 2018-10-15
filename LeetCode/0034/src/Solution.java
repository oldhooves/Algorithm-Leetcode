/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 * Created by 老蹄子 on 2018/10/15 下午1:53
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                while (mid >= left && nums[mid] == target){
                    mid --;
                }
                result[0] = mid + 1;
                mid = (left + right) / 2;
                while (mid <= right && nums[mid] == target){
                    mid++;
                }
                result[1] = mid - 1;
                break;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return result;
    }
}
