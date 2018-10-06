/**
 * 106. 从中序与后序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 * Created by 老蹄子 on 2018/10/6 下午3:32
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

    private TreeNode myBuildTree(int[] inorder,int inStart,int inEnd,int[] postorder,
                                 int postStart,int postEnd){
        if (inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int position = findPosition(inorder,inStart,inEnd,postorder[postEnd]);
        root.left = myBuildTree(inorder,inStart,position - 1,postorder,
                postStart,postStart + (position - inStart - 1));
        root.right = myBuildTree(inorder,position + 1,inEnd,postorder,
                postStart + (position - inStart),postEnd - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length){
            return null;
        }
        return myBuildTree(inorder,0,inorder.length - 1,postorder,0,postorder.length - 1);
    }
}