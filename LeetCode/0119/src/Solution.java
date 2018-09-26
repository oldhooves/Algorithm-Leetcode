import java.util.Arrays;
import java.util.List;

/**
 * 119. 杨辉三角 II
 * https://leetcode-cn.com/problems/pascals-triangle-ii/description/
 * Created by 老蹄子 on 2018/9/26 下午8:26
 */
class Solution {

    public List<Integer> getRow(int rowIndex) {

        Integer[] result = new Integer[rowIndex+1];
        Arrays.fill(result,0);
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            for (int j = i; j > 0; j--) {
                result[j] = result[j] + result[j - 1];
            }
        }

        return Arrays.asList(result);
    }
}
