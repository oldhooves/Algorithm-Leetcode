import java.util.ArrayList;
import java.util.List;

/**
 * 653. 两数之和 IV - 输入 BST
 * https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/description/
 * Created by 老蹄子 on 2019/2/24 下午4:04
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

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        for (int i = 0, j = nums.size() - 1; i < j;) {
            if (nums.get(i) + nums.get(j) == k) {
                return true;
            }
            if (nums.get(i) + nums.get(j) < k) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public void inorder(TreeNode root, List<Integer> nums){
        if(root == null)return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}