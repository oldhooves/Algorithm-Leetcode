import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 368. 最大整除子集
 * https://leetcode-cn.com/problems/largest-divisible-subset/description/
 * Created by 老蹄子 on 2018/11/14 下午7:39
 */
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        int max = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            pre[i]= -1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        count[i] = count[j] + 1;
                        pre[i] = j;
                    }
                }
            }
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }

        List<Integer> res = new ArrayList<>();
        while (index != -1) {
            res.add(nums[index]);
            index = pre[index];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,10,20};
        System.out.println(new Solution().largestDivisibleSubset(nums));
    }
}