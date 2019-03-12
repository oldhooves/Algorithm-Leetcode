import java.util.*;

/**
 * 301. 删除无效的括号
 * https://leetcode-cn.com/classic/problems/remove-invalid-parentheses/description/
 * Created by 老蹄子 on 2019/3/12 下午8:32
 */
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        if (s == null) {
            return res;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        visited.add(s);
        boolean found = false;

        while (!queue.isEmpty()) {
            s = queue.poll();
            if (isValid(s)) {
                res.add(s);
                found = true;
            }
            if (found) {
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '(' && s.charAt(i) != ')') {
                    continue;
                }
                String t = s.substring(0,i) + s.substring(i + 1);
                if (!visited.contains(t)) {
                    queue.add(t);
                    visited.add(t);
                }
            }
        }
        return res;
    }

    private boolean isValid(String str){
        int count = 0;
        for (char c : str.toCharArray()){
            if (c == '('){
                count++;
            }else if (c == ')'){
                count--;
                if (count < 0){
                    return false;
                }
            }
        }
        return count == 0;
    }
}
