import java.util.*;

/**
 * 71. 简化路径
 * https://leetcode-cn.com/problems/simplify-path/description/
 * Created by 老蹄子 on 2018/10/24 下午4:24
 */
class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        String[] dirs = path.split("/");
        for (String dir : dirs){
            if (dir.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if (!skip.contains(dir)){
                stack.push(dir);
            }
        }
        String res = "";
        for (String dir : stack){
            res = "/" + dir + res;
        }
        return res.isEmpty() ? "/" : res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().simplifyPath("/abc/..."));
    }
}
