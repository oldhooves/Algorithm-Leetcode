import java.util.Stack;

/**
 * Created by 老蹄子 on 2018/10/25 下午1:43
 */
public class Solution2 {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        char[] ss = s.toCharArray();
        for(int i=0;i<ss.length;i++){
            if(ss[i] == '('){
                left.push(i);
            }
            else if(ss[i] == ')'){
                if(!left.empty()){
                    left.pop();
                }else if(!star.empty()){
                    star.pop();
                } else return false;
            }
            else if(ss[i] == '*'){
                star.push(i);
            }
        }

        while (!left.isEmpty() && !star.isEmpty()){
            if (left.pop() > star.pop()){
                return false;
            }
        }
        return left.empty();
    }
}
