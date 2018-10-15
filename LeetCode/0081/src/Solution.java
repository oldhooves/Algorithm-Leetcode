/**
 * 81. 搜索旋转排序数组 II
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/description/
 * Created by 老蹄子 on 2018/10/15 下午5:32
 */
class Solution {
    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]){
                return true;
            }
        }
        return false;
    }
}
