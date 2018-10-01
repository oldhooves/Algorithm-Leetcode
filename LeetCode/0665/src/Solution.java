import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 665. 非递减数列
 * https://leetcode-cn.com/problems/non-decreasing-array/description/
 * Created by 老蹄子 on 2018/10/1 下午4:32
 */
class Solution {
    public boolean checkPossibility(int[] nums) {

        int left = -1;
        int right = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] > nums[i]){
                left = i - 1;
                right = i;
                break;
            }
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list1.add(nums[i]);
        }
        if (left != -1){
            list1.remove(left);
        }


        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list2.add(nums[i]);
        }
        if (right != -1){
            list2.remove(right);
        }


        if (judge(list1) || judge(list2)){
            return true;
        }
        return false;
    }

    private boolean judge(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,2,3};
        System.out.println(new Solution().checkPossibility(nums));
    }
}
