import java.util.ArrayList;
import java.util.List;

/**
 * 442. 数组中重复的数据
 * https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/description/
 * Created by 老蹄子 on 2018/10/6 下午3:22
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            if (nums[temp - 1] > 0){
                nums[temp - 1] = -nums[temp - 1];
            }else {
                res.add(temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(new Solution().findDuplicates(nums).toString());
    }
}
