import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. 组合总和 II
 * https://leetcode-cn.com/problems/combination-sum-ii/description/
 * Created by 老蹄子 on 2018/10/6 下午9:52
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = candidates.length;
        Arrays.sort(candidates);
        backTrack(result,new ArrayList<>(),candidates,target,0,len);
        return result;
    }

    private void backTrack(List<List<Integer>> list,List<Integer> tempList,int[] nums,
                           int remain,int start,int len){
        if (remain < 0){
            return;
        }else if (remain == 0){
            list.add(new ArrayList<>(tempList));
        }else {
            for (int i = start; i < len; i++) {
                if (i > start && nums[i] == nums[i - 1]){
                    continue;
                }
                tempList.add(nums[i]);
                backTrack(list,tempList,nums,remain - nums[i],i + 1,len);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(new Solution().combinationSum2(candidates,8));
    }
}
