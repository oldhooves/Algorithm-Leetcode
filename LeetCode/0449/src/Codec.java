import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 449. 序列化和反序列化二叉搜索树
 * https://leetcode-cn.com/problems/serialize-and-deserialize-bst/description/
 * Created by ${laotizi} on 2019-03-04.
 */
public class Codec {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static final String SEP = ",";
    private static final String NULL = "null";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return NULL;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            sb.append(root.val).append(SEP);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(NULL)) {
            return null;
        }
        String[] strs = data.split(SEP);
        Queue<Integer> q= new LinkedList<Integer>();
        for (String s : strs) {
            q.offer(Integer.parseInt(s));
        }
        return getNode(q);
    }

    private TreeNode getNode(Queue<Integer> q) {
        if (q.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(q.poll());
        Queue<Integer> smallerQueue = new LinkedList<Integer>();
        while (!q.isEmpty() && q.peek() < root.val) {
            smallerQueue.offer(q.poll());
        }
        root.left = getNode(smallerQueue);
        root.right = getNode(q);
        return root;
    }
}