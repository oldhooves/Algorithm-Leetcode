import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 78. 子集
 * https://leetcode-cn.com/problems/subsets/description/
 * Created by 老蹄子 on 2018/10/2 下午1:20
 */
class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        getSubset(list,tempList,0,nums,len);
        return list;
    }

    private void getSubset(List<List<Integer>> list,List<Integer> tempList,int startLen,
                           int[] nums,int len){
        list.add(new ArrayList<>(tempList));
        for (int i = startLen; i < len; i++) {
            tempList.add(nums[i]);
            getSubset(list,tempList,i+1,nums,len);
            tempList.remove(tempList.size()-1);
        }

    }

    public static void main(String[]args){
        int []nums = {1,2,3};
        List<List<Integer>> list = new Solution().subsets(nums);
        int len = list.size();
        for(int i = 0 ; i < len;  i++){
            System.out.println(list.get(i));
        }
    }
}
