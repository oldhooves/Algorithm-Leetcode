import java.util.*;

/**
 * 532. 数组中的K-diff数对
 * https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/description/
 * Created by 老蹄子 on 2018/10/1 下午8:30
 */
class Solution {
    public int findPairs(int[] nums, int k) {

        int num = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        if (k < 0){
            return 0;
        }
        else if (k == 0){
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i]) + 1);
                }else {
                    map.put(nums[i],1);
                }
            }
            for (Integer a :map.values()) {
                if (a != 1){
                    num++;
                }
            }
            return num;

        }
        else {
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            for (int a : set) {
                int temp = a + k;
                if (set.contains(temp)){
                    num++;
                }
            }
            return num;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(new Solution().findPairs(nums,-1));
    }
}

