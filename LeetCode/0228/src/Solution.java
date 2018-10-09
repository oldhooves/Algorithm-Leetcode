import java.util.ArrayList;
import java.util.List;

/**
 * 228. 汇总区间
 * https://leetcode-cn.com/problems/summary-ranges/description/
 * Created by 老蹄子 on 2018/10/8 下午9:07
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if (nums.length == 0){
            return result;
        }
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1){
                group(result,start,nums[i - 1]);
                start = nums[i];
            }
        }
        group(result,start,nums[nums.length - 1]);
        return result;
    }

    private void group(List<String> list,int start,int end){
        if (start == end) {
            list.add(start + "");
        }else {
            list.add(start + "->" + end);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(new Solution().summaryRanges(nums));
    }
}
