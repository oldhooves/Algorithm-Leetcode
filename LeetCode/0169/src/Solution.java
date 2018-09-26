import java.util.HashMap;

/**
 * 169. 求众数
 * https://leetcode-cn.com/problems/majority-element/description/
 * Created by 老蹄子 on 2018/9/25 下午10:18
 */
class Solution {

    public int majorityElement(int[] nums) {

        double N = (double) nums.length / 2.0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        for(Integer key : map.keySet()){
            int res = map.get(key);
            if (res > N){
                return key;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println((new Solution().majorityElement(nums)));
    }
}