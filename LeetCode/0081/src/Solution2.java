/**
 * Created by 老蹄子 on 2018/10/15 下午7:36
 */
public class Solution2 {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return true;
            }
            if (nums[mid] > nums[right]){
                if (target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else if (nums[mid] < nums[right]){
                if (target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }else {
                right--;
            }
        }
        return false;
    }
}
