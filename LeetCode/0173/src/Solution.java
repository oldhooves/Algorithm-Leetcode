import java.util.Stack;

/**
 * 173. 二叉搜索树迭代器
 * https://leetcode-cn.com/problems/binary-search-tree-iterator/description/
 * Created by ${laotizi} on 2019-02-28.
 */

class BSTIterator {

    private Stack<TreeNode> stack = new Stack<TreeNode>();

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushAll(TreeNode node) {
        for (; node != null; stack.push(node),node = node.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */