/**
 * Created by 老蹄子 on 2018/9/28 下午9:18
 */
public class Solution2 {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        //最大值索引
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }
        //此大值索引
        int second = max == 0 ? 1 : 0;
        for (int i = 0; i < nums.length; i++) {
            if (max == i){
                continue;
            }
            if (nums[i] > nums[second]){
                second = i;
            }
        }
        return nums[second] * 2 > nums[max] ? -1 : max;
    }
}
