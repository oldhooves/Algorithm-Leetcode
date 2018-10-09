import java.util.Arrays;

/**
 * 611. 有效三角形的个数
 * https://leetcode-cn.com/problems/valid-triangle-number/description/
 * Created by 老蹄子 on 2018/10/9 下午3:46
 */
class Solution {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length < 3){
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int l = 0;
            int r = i - 1;
            while (l < r){
                if (nums[l] + nums[r] > nums[i]){
                    count += r - l;
                    r--;
                }else {
                    l++;
                }
            }
        }
        return count;
    }
}
