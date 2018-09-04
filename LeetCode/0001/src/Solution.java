import java.util.HashMap;

/**
 * 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/description/
 * Created by 老蹄子 on 2018/9/4 上午10:44
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                if (map.get(target-nums[i])!=i){
                    int[] res = {i,map.get(target-nums[i])};
                    return res;
                }
            }
        }

        throw new IllegalArgumentException("no solution");
    }

    private static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {0,4,3,0};
        int[] nums2 = {2, 7, 11, 15};
        int target = 0;
        printArr((new Solution()).twoSum(nums, target));
        printArr((new Solution()).twoSum(nums2,9));
    }
}
