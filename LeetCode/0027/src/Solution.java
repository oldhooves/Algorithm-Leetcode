/**
 * 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/description/
 * Created by 老蹄子 on 2018/9/26 下午9:11
 */
class Solution {

    public int removeElement(int[] nums, int val) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}