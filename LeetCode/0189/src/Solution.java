/**
 * 189. 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/description/
 * Created by ${laotizi} on 2018-09-29.
 */
class Solution {
    public void rotate(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k % nums.length == 0){
            return;
        }

        int turns = k % nums.length;
        int middle = nums.length - turns;
        reverse(nums,0,middle - 1);
        reverse(nums,middle,nums.length - 1);
        reverse(nums,0,nums.length - 1);
    }

    private void reverse(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}