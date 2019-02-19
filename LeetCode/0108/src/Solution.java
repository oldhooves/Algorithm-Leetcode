/**
 * 108. 将有序数组转换为二叉搜索树
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * Created by ${laotizi} on 2019-02-19.
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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode head = helper(nums,0,nums.length - 1);
        return head;
    }

    private TreeNode helper(int[] num, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num,low,mid - 1);
        node.right = helper(num,mid + 1,high);
        return node;
    }
}