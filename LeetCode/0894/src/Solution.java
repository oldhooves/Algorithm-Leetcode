import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 894. 所有可能的满二叉树
 * https://leetcode-cn.com/problems/all-possible-full-binary-trees/description/
 * Created by ${laotizi} on 2019-02-27.
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

    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (N == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        N = N - 1;
        for (int i = 1; i < N; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N - i);
            for (TreeNode nl : left) {
                for (TreeNode nr : right) {
                    TreeNode cur = new TreeNode(0);
                    cur.left = nl;
                    cur.right = nr;
                    res.add(cur);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<TreeNode> list = new Solution().allPossibleFBT(7);
        System.out.println(list.toString());
    }
}