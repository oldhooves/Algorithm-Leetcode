import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 491. 递增子序列
 * https://leetcode-cn.com/classic/problems/increasing-subsequences/description/
 * Created by 老蹄子 on 2019/3/10 上午10:42
 */
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        helper(new LinkedList<Integer>(),0,nums,res);
        return res;
    }

    private void helper(LinkedList<Integer> list, int index, int[] nums, List<List<Integer>> res) {
        if (list.size() > 1) {
            res.add(new LinkedList<>(list));
        }
        Set<Integer> used = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (used.contains(nums[i])) {
                continue;
            }
            if (list.size() == 0 || nums[i] >= list.peekLast()) {
                used.add(nums[i]);
                list.add(nums[i]);
                helper(list, i + 1, nums, res);
                list.remove(list.size() - 1);
            }
        }
    }
}