/**
 * 31. 下一个排列
 * https://leetcode-cn.com/problems/next-permutation/description/
 * Created by 老蹄子 on 2018/10/16 下午2:19
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        if (nums.length == 1){
            return;
        }
        int i = nums.length - 2;
        for (; i >= 0 && nums[i] >= nums[i + 1];i--);
        if (i >= 0){
           int j = i + 1;
           for (; j < nums.length && nums[j] > nums[i]; ++j);
           swap(nums,i,j - 1);
        }
        int k = nums.length - 1;
        i++;
        for (; i < k; i++,k--){
            swap(nums,i,k);
        }
    }

    public void swap(int[] array,int i ,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        new Solution().nextPermutation(nums);
    }
}