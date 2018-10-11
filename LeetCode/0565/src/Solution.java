/**
 * 565. 数组嵌套
 * https://leetcode-cn.com/problems/array-nesting/description/
 * Created by 老蹄子 on 2018/10/11 下午7:27
 */
class Solution {
    public int arrayNesting(int[] nums) {
        int num, res = 1, count = 1, temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1){
                num = nums[i];
                while (num != i){
                    temp = num;
                    num = nums[num];
                    nums[temp] = -1;
                    count++;
                }
                res = Math.max(res,count);
                count = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,0,3,1,6,2};
        System.out.println(new Solution().arrayNesting(nums));
    }
}