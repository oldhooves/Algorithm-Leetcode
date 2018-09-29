/**
 * 643. 子数组最大平均数 I
 * Created by ${laotizi} on 2018-09-29.
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int j=0;j<k;j++)
        {
            sum+=nums[j];
        }
        double temp=sum;
        for(int i=1;i+k<=nums.length;i++)
        {
            temp=temp-nums[i-1]+nums[i+k-1];
            sum=temp>sum?temp:sum;
        }
        return sum/k;
    }
}
