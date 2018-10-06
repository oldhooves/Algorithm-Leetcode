import sun.java2d.pipe.SolidTextRenderer;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 * Created by 老蹄子 on 2018/10/6 下午4:40
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

    private int findPosition(int[] array,int start,int end,int key){
        for (int i = start; i <= end; i++) {
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    private TreeNode myBuildTree(int[] preorder,int preStart,int preEnd,int[] inorder,
                                 int inStart,int inEnd){
        if (inStart > inEnd){
            return null;
        }

        if (preStart > preEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int position = findPosition(inorder,inStart,inEnd,preorder[preStart]);
        root.left = myBuildTree(preorder,preStart+1,preStart + (position-inStart),inorder,inStart,position-1);
        root.right = myBuildTree(preorder,preStart+position-inStart+1,preEnd,inorder,position+1,inEnd);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length){
            return null;
        }
        return myBuildTree(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        System.out.println(new Solution().buildTree(preorder,inorder).toString());
    }
}
