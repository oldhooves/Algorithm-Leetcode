/**
 * 75. 颜色分类
 * https://leetcode-cn.com/problems/sort-colors/description/
 * Created by 老蹄子 on 2018/9/3 上午10:08
 */
public class Solution2 {

    public void sortColors(int[] nums){

        int zero = -1;         // [0...zero] == 0
        int two = nums.length; // [two...n-1] == 2

        for (int i = 0; i < two;) {
            if (nums[i] ==1){
                i++;
            }else if (nums[i] ==2){
                two--;
                swap(nums,i,two);
            }else {
                zero++;
                swap(nums,zero,i);
                i++;
            }
        }
    }


    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }

    public static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 2, 1, 1, 0};
        (new Solution2()).sortColors(nums);
        printArr(nums);
    }

}
