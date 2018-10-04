import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. 组合总和
 * https://leetcode-cn.com/problems/combination-sum/description/
 * Created by 老蹄子 on 2018/10/4 下午7:05
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int len = candidates.length;
        Arrays.sort(candidates);
        backTrack(list,new ArrayList<>(),candidates,target,0,len);
        return list;
    }

    private void backTrack(List<List<Integer>> list,List<Integer> tempList,int[] nums,
                           int remain,int start,int len){
        if (remain < 0){
            return;
        }else if (remain == 0){
            list.add(new ArrayList<>(tempList));
        }else {
            for (int i = start; i < len; i++) {
                tempList.add(nums[i]);
                backTrack(list,tempList,nums,remain - nums[i],i,len);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        System.out.println(new Solution().combinationSum(candidates,8));
    }
}
