/**
 * Created by 老蹄子 on 2018/10/9 下午10:48
 */
public class Solution2 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(new Solution2().findPeakElement(nums));
    }
}
