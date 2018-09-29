/**
 * 724. 寻找数组的中心索引
 * https://leetcode-cn.com/problems/find-pivot-index/description/
 * Created by ${laotizi} on 2018-09-29.
 */
class Solution {
    public int pivotIndex(int[] nums) {

        if (nums.length == 0){
            return -1;
        }
        if (nums.length == 1){
            return 0;
        }
        if (nums.length == 2){
            return -1;
        }

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft == sumRight){
                return i;
            }else {
                if (i == nums.length - 1){
                    return -1;
                }
                sumLeft += nums[i];
                sumRight -= nums[i + 1];
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(new Solution().pivotIndex(nums));
    }
}



