import java.util.HashMap;
import java.util.Map;

/**
 * 659. 分割数组为连续子序列
 * https://leetcode-cn.com/classic/problems/split-array-into-consecutive-subsequences/description/
 * Created by ${laotizi} on 2019-03-22.
 */
class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> fre = new HashMap<>();
        Map<Integer, Integer> append = new HashMap<>();
        for (int i : nums) {
            fre.put(i,fre.getOrDefault(i,0) + 1);
        }
        for (int num : nums) {
            if (fre.get(num) == 0){
                continue;
            } else if (append.getOrDefault(num, 0) > 0) {
                append.put(num,append.get(num) - 1);
                append.put(num + 1,append.getOrDefault(num + 1,0) + 1);
            } else if (fre.getOrDefault(num + 1, 0) > 0 && fre.getOrDefault(num + 2, 0) > 0) {
                fre.put(num + 1,fre.get(num + 1) - 1);
                fre.put(num + 2,fre.get(num + 2) - 1);
                append.put(num + 3,append.getOrDefault(num + 3,0) + 1);
            } else {
                return false;
            }
            fre.put(num,fre.get(num) - 1);
        }
        return true;
    }
}