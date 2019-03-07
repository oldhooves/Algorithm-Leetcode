import java.util.List;
import java.util.Stack;

/**
 * 841. 钥匙和房间
 * https://leetcode-cn.com/classic/problems/keys-and-rooms/description/
 * Created by 老蹄子 on 2019/3/7 下午8:16
 */
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int key : rooms.get(node)) {
                if (!seen[key]) {
                    seen[key] = true;
                    stack.push(key);
                }
            }
        }
        for (boolean v : seen) {
            if (!v) {
                return false;
            }
        }
        return true;
    }
}
