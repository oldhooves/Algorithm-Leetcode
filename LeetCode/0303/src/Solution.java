/**
 * 303. 区域和检索 - 数组不可变
 * https://leetcode-cn.com/problems/range-sum-query-immutable/description/
 * Created by 老蹄子 on 2018/8/25 下午5:00
 */
class NumArray {

    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i =1;i<sum.length;i++){
            sum[i] = sum[i-1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1] - sum[i];
    }
}