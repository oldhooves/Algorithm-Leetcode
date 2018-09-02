import java.util.ArrayList;

/**
 * 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/description/
 * Created by 老蹄子 on 2018/9/2 下午9:54
 */
class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                arrayList.add(nums[i]);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }

        for (int i = arrayList.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        (new Solution()).moveZeroes(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}