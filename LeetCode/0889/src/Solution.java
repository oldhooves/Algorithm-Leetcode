import java.util.Arrays;

/**
 * 889. 根据前序和后序遍历构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/
 * Created by 老蹄子 on 2019/3/5 下午8:05
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

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int N = pre.length;
        if (N == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        if (N == 1) {
            return root;
        }
        int L = 0;
        for (int i = 0; i < N; i++) {
            if (post[i] == pre[1]) {
                L = i + 1;
            }
        }
        root.left = constructFromPrePost(Arrays.copyOfRange(pre,1,L + 1),
                Arrays.copyOfRange(post,0,L));
        root.right = constructFromPrePost(Arrays.copyOfRange(pre,L + 1,N),
                Arrays.copyOfRange(post,L,N - 1));
        return root;

    }
}