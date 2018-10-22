import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * https://leetcode-cn.com/problems/generate-parentheses/description/
 * Created by 老蹄子 on 2018/10/22 下午4:44
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(n,n,"",res);
        return res;
    }

    private void generate(int left,int right,String str,List<String> res){
        if (left == 0 && right == 0){
            res.add(str);
        }
        if (left > 0){
            generate(left - 1,right,str + "(",res);
        }
        if (left < right){
            generate(left,right - 1,str + ")",res);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }
}
