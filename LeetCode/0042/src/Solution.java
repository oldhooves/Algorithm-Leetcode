/**
 * 42. 接雨水
 * https://leetcode-cn.com/problems/trapping-rain-water/description/
 * Created by 老蹄子 on 2018/10/17 下午2:22
 */
class Solution {
    public int trap(int[] height) {
        if (height.length < 3){
            return 0;
        }
        int res = 0;
        int highestLeft = height[0];
        int highestRight = height[height.length - 1];
        int l = 1;
        int r = height.length - 2;
        while (l <= r){
            if (highestLeft < highestRight){
                if (highestLeft < height[l]){
                    highestLeft = height[l];
                }else {
                    res += highestLeft - height[l];
                }
                l++;
            }else {
                if (highestRight < height[r]){
                    highestRight = height[r];
                }else {
                    res += highestRight - height[r];
                }
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new Solution().trap(height));
    }
}
