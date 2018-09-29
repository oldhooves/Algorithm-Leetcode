import java.util.HashSet;
import java.util.Set;

/**
 * 888. 公平的糖果交换
 * https://leetcode-cn.com/problems/fair-candy-swap/description/
 * Created by ${laotizi} on 2018-09-29.
 */
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        for (int x : A) {
            sumA += x;
        }
        for (int y : B) {
            sumB += y;
        }
        int temp = (sumB - sumA) / 2;
        Set<Integer> set = new HashSet<Integer>();
        for (int x : B){
            set.add(x);
        }
        for (int x : A){
            if (set.contains(x + temp)){
                return new int[]{x,x + temp};
            }
        }
        return null;
    }
}