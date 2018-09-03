
import java.util.ArrayList;

/**
 * 75. 颜色分类
 * https://leetcode-cn.com/problems/sort-colors/description/
 * Created by 老蹄子 on 2018/9/3 上午9:36
 */
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0,count1 = 0,count2 = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == 0){
                count0++;
            }else if (nums[i] == 1){
                count1++;
            }else {
                count2++;
            }
        }
        for (int i = 0; i <count0 ; i++) {
            nums[i] = 0;
        }
        for (int j = count0; j < count0+count1; j++) {
            nums[j] = 1;
        }
        for (int k = count0 +count1; k < count0+count1+count2; k++) {
            nums[k] = 2;
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        new Solution().sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
