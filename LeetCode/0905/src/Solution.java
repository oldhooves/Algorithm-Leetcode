import java.util.ArrayList;

/**
 * 905. 按奇偶校验排序数组
 * https://leetcode-cn.com/problems/sort-array-by-parity/description/
 * Created by 老蹄子 on 2018/9/19 下午10:40
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {

        ArrayList<Integer> ji = new ArrayList<>();
        ArrayList<Integer> ou = new ArrayList<>();
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0){
                ou.add(A[i]);
            }else {
                ji.add(A[i]);
            }
        }

        for (int i = 0; i < ji.size(); i++) {
            ou.add(ji.get(i));
        }
        for (int i = 0; i < ou.size(); i++) {
            result[i] = ou.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int A[] = {3,1,2,4};
        int[] a = (new Solution()).sortArrayByParity(A);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
