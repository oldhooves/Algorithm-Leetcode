import java.util.TreeSet;

/**
 * 220. 存在重复元素 III
 * https://leetcode-cn.com/problems/contains-duplicate-iii/description/
 * Created by 老蹄子 on 2018/9/4 下午5:24
 */
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        TreeSet<Long> record = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {

            if (record.ceiling((long)nums[i] - (long)t) != null &&
                    record.ceiling((long)nums[i] - (long)t) <= (long)nums[i] + (long)t){
                return true;
            }

            record.add((long)nums[i]);
            if (record.size() == k + 1){
                record.remove((long)nums[i-k]);
            }
        }
        return false;
    }

    private static void printBool(boolean b){
        System.out.println(b ? "True" : "False");
    }

    public static void main(String[] args) {

        int[] nums = {1,5,9,1,5,9};
        int k = 2;
        int t = 3;
        printBool((new Solution()).containsNearbyAlmostDuplicate(nums, k, t));
    }
}