/**
 * 915. 分割数组
 * https://leetcode-cn.com/problems/partition-array-into-disjoint-intervals/description/
 * Created by 老蹄子 on 2018/10/14 下午8:29
 */
class Solution {
    public int partitionDisjoint(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max,A[i]);
            boolean result = judge(A,i + 1,max);
            if (result){
                return i + 1;
            }
        }
        return -1;
    }

    private boolean judge(int[] A, int index, int target) {
        for (int i = index; i < A.length; i++) {
            if (target > A[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {5,0,3,8,6};
        System.out.println(new Solution().partitionDisjoint(A));
    }
}
