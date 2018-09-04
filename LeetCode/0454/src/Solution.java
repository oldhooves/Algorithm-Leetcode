import java.util.HashMap;

/**
 * 454. 四数相加 II
 * https://leetcode-cn.com/problems/4sum-ii/description/
 * Created by 老蹄子 on 2018/9/4 下午1:07
 */
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i]+D[j];
                if (map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else {
                    map.put(sum,1);
                }
            }
        }

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (map.containsKey(-A[i]-B[j])){
                    result += map.get(-A[i]-B[j]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2};
        int[] b = {-2,-1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        System.out.println((new Solution().fourSumCount(a,b,c,d)));
    }
}