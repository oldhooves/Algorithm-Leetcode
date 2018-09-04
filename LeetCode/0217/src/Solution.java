import java.util.HashSet;

/**
 * 217. 存在重复元素
 * https://leetcode-cn.com/problems/contains-duplicate/description/
 * Created by 老蹄子 on 2018/9/4 下午3:56
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> record = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i ++){
            if(record.contains(nums[i])){
                return true;
            }
            record.add(nums[i]);

        }
        return false;

    }
}