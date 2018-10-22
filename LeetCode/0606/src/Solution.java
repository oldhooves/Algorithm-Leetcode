/**
 * 606. 根据二叉树创建字符串
 * https://leetcode-cn.com/problems/construct-string-from-binary-tree/description/
 * Created by 老蹄子 on 2018/10/22 下午3:48
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

    public String tree2str(TreeNode t) {
        if (t == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        convert(t,sb);
        return sb.toString();
    }

    private void convert(TreeNode node,StringBuilder sb){
        sb.append(node.val);
        if (node.left != null){
            sb.append("(");
            convert(node.left,sb);
            sb.append(")");
        }else if (node.right != null){
            sb.append("()");
        }
        if (node.right != null){
            sb.append("(");
            convert(node.right,sb);
            sb.append(")");
        }
    }
}
