import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by ${laotizi} on 2018-09-28.
 */
class Solution {

    public int findShortestSubArray(int[] nums) {

        int maxCount = 1;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int temp = map.get(nums[i])+1;
                map.put(nums[i],temp);
                if (maxCount < temp){
                    maxCount = temp;
                }
            }else {
                map.put(nums[i],1);
            }
        }
        Set<Integer> set = map.keySet();
        int minDistance = Integer.MAX_VALUE;
        for (int num : set){
            int temp = Integer.MAX_VALUE;
            if (map.get(num) == maxCount){
                int i = 0;
                int j = nums.length - 1;
                while (nums[i] != num && i < j ){
                    i++;
                }
                while (nums[j] != num && i < j){
                    j--;
                }
                temp = j - i + 1;
            }
            minDistance = Math.min(minDistance,temp);
        }
        return minDistance;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,2};
        int res = new Solution().findShortestSubArray(nums);
        System.out.println(res);
    }
}