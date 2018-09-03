/**
 * 167. 两数之和 II - 输入有序数组
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 * Created by 老蹄子 on 2018/9/3 上午10:59
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length - 1;
        while (l < r){
            if (numbers[l] + numbers[r] == target){
                int[] res = {l+1,r+1};
                return res;
            }else if (numbers[l] + numbers[r] < target){
                l++;
            }else {
                r--;
            }
        }
        return null;

    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] result = (new Solution()).twoSum(arr,9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
