import java.util.HashMap;
import java.util.Map;

/**
 * 525. 连续数组
 * https://leetcode-cn.com/problems/contiguous-array/description/
 * Created by 老蹄子 on 2018/11/23 下午4:31
 */
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen = 0,count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen,i - map.get(count));
            }else {
                map.put(count,i);
            }
        }
        return maxlen;
    }
}
