import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 118. 杨辉三角
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 * Created by 老蹄子 on 2018/9/25 下午9:06
 */
class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0){
            return res;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j = 1; j < res.get(i - 1).size(); j++) {
                temp.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
            }

            temp.add(1);
            res.add(temp);
        }

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = (new Solution().generate(5));
        System.out.println(res);
    }
}
