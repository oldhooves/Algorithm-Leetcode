/**
 * 704. 二分查找
 * https://leetcode-cn.com/classic/problems/binary-search/description/
 * Created by 老蹄子 on 2019/3/12 下午9:52
 */
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
