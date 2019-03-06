import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 652. 寻找重复的子树
 * https://leetcode-cn.com/problems/find-duplicate-subtrees/description/
 * Created by 老蹄子 on 2019/3/6 下午9:11
 */
class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        postOrder(root,new HashMap<>(),res);
        return res;
    }

    private String postOrder(TreeNode cur, Map<String, Integer> map, List<TreeNode> res) {
        if (cur == null) {
            return "#";
        }
        String serial = cur.val + "," + postOrder(cur.left,map,res) + "," + postOrder(cur.right,map,res);
        if (map.getOrDefault(serial, 0) == 1) {
            res.add(cur);
        }
        map.put(serial,map.getOrDefault(serial,0) + 1);
        return serial;
    }
}