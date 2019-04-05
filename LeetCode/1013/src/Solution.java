/**
 * 1013. 将数组分成和相等的三个部分
 * https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 * Created by 老蹄子 on 2019/4/5 下午2:39
 */
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int n : A) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int curSum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == sum && count <= 1) {
                count++;
                curSum = 0;
            }
        }
        return (count == 2 && curSum == sum);
    }
}