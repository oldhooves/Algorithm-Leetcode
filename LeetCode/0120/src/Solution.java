import java.util.ArrayList;
import java.util.List;

/**
 * 120. 三角形最小路径和
 * https://leetcode-cn.com/problems/triangle/description/
 * Created by ${laotizi} on 2018-10-08.
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] res = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                res[j] = Math.min(res[j],res[j + 1]) + triangle.get(i).get(j);
            }
        }
        return res[0];
    }
}