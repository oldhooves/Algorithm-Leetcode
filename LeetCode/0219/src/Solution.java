import java.util.HashSet;

/**
 * 219. 存在重复元素 II
 * https://leetcode-cn.com/problems/contains-duplicate-ii/description/
 * Created by 老蹄子 on 2018/9/4 下午3:30
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> record = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i ++){
            if(record.contains(nums[i]))
                return true;

            record.add(nums[i]);
            if(record.size() == k + 1)
                record.remove(nums[i-k]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 3;
        (new Solution()).containsNearbyDuplicate(nums,k);
    }
}
