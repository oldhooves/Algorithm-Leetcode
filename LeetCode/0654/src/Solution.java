/**
 * 654. 最大二叉树
 * https://leetcode-cn.com/problems/maximum-binary-tree/description/
 * Created by ${laotizi} on 2019-02-26.
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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int max_i = max(nums,l,r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums,l,max_i);
        root.right = construct(nums,max_i + 1,r);
        return root;
    }

    private int max(int[] nums, int l, int r) {
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i]) {
                max_i = i;
            }
        }
        return max_i;
    }
}