/**
 * 167. 两数之和 II - 输入有序数组
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 * Created by 老蹄子 on 2018/9/3 上午10:59
 */
class Solution2 {
    public int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < numbers.length-1; i++) {
            int j = binarySearch(numbers,i+1,numbers.length-1,target-numbers[i]);
            if (j != -1){
                int[] res = {i+1,j+1};
                return res;
            }
        }
        throw new IllegalArgumentException("无答案");
    }

    private int binarySearch(int[] nums,int l,int r,int target){
        if(l < 0 || l > nums.length)
            throw new IllegalArgumentException("l is out of bound");

        if(r < 0 || r > nums.length)
            throw new IllegalArgumentException("r is out of bound");

        while (l <= r){
            int mid = l + (r - l)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] result = (new Solution2()).twoSum(arr,9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
