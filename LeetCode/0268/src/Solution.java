import java.util.Arrays;
import java.util.HashMap;

/**
 * 268. 缺失数字
 * https://leetcode-cn.com/problems/missing-number/description/
 * Created by 老蹄子 on 2018/9/26 下午9:44
 */
class Solution {

    public int missingNumber(int[] nums) {

        int len = nums.length;
        int[] result = new int[len+1];
        Arrays.fill(result,0);
        for (int i = 0; i < len; i++) {
            result[nums[i]] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (result[i] == 0){
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int[] nums1 ={0};
        int res = new Solution().missingNumber(nums1);
        System.out.println(res);
    }
}