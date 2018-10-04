import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 216. 组合总和 III
 * https://leetcode-cn.com/problems/combination-sum-iii/description/
 * Created by 老蹄子 on 2018/10/4 下午7:54
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        traceBack(list,tempList,k,1,n);
        return list;

    }

    private void traceBack(List<List<Integer>> list,List<Integer> tempList,int k,
                           int start,int n){
        if (n < 0){
            return;
        }
        if (n == 0 && tempList.size() == k){
            list.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= 9; i++) {
            tempList.add(i);
            traceBack(list,tempList,k,i+1,n-i);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println((new Solution().combinationSum3(3,9)).toString());
    }
}
