import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 508. 出现次数最多的子树元素和
 * https://leetcode-cn.com/problems/most-frequent-subtree-sum/description/
 * Created by 老蹄子 on 2018/11/21 下午3:40
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

    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        helper(root,map);
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (freq >= max) {
                if (freq > max) {
                    list.clear();
                    max = freq;
                }
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int helper(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left,map);
        int right = helper(root.right,map);
        int sum = left + right + root.val;
        map.put(sum,map.getOrDefault(sum,0) + 1);
        return sum;
    }
}