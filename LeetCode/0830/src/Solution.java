import java.util.ArrayList;
import java.util.List;

/**
 * 830. 较大分组的位置
 * https://leetcode-cn.com/problems/positions-of-large-groups/description/
 * Created by 老蹄子 on 2018/9/28 下午8:19
 */
class Solution {

    public List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> res = new ArrayList<>();
        int len = S.length();
        int sum = 1;
        for (int i = 0; i < len - 1; i++) {

            if (S.charAt(i) == S.charAt(i + 1)){
                sum += 1;

            }
            else{
                if (sum >= 3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i - sum + 1);
                    temp.add(i);
                    res.add(temp);
                }
                sum = 1;
            }

        }
        if (sum >= 3){
            List<Integer> temp = new ArrayList<>();
            temp.add(len - sum);
            temp.add(len - 1);
            res.add(temp);
        }

        return res;
    }


}
