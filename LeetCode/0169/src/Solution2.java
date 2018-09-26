/**
 * Created by 老蹄子 on 2018/9/26 下午7:43
 */
class Solution2 {
    public int majorityElement(int[] nums) {

        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (res == nums[i]){
                count++;
            }
            else {
                count--;
                if (count == 0){
                    res = nums[++i];
                    count++;
                }
            }
        }
        return res;
    }
}