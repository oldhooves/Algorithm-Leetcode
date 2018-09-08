import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/description/
 * Created by 老蹄子 on 2018/9/8 下午5:25
 */
class Solution {

    private String LetterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    private ArrayList<String> res;

    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if (digits.equals("")){
            return res;
        }
        findCombination(digits,0,"");
        return res;
    }

    private void findCombination(String digits,int index,String s){

        if (index == digits.length()){
            res.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String letters = LetterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits,index+1,s + letters.charAt(i));
        }

        return;
    }

    public static void main(String[] args) {
        (new Solution()).letterCombinations("23");
    }
}
