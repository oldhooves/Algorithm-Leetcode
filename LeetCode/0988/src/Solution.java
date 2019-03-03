/**
 * 988. 从叶结点开始的最小字符串
 * https://leetcode-cn.com/problems/smallest-string-starting-from-leaf/description/
 * Created by 老蹄子 on 2019/3/3 下午8:53
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

    String ans = "~";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return ans;
    }

    private void dfs(TreeNode node, StringBuilder stringBuilder) {
        if (node == null) {
            return;
        }
        stringBuilder.append((char)('a' + node.val));
        if (node.left == null && node.right == null) {
            stringBuilder.reverse();
            String S = stringBuilder.toString();
            stringBuilder.reverse();
            if (S.compareTo(ans) < 0) {
                ans = S;
            }
        }
        dfs(node.left,stringBuilder);
        dfs(node.right,stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }
}
