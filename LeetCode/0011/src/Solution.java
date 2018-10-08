/**
 * 11. 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/description/
 * Created by ${laotizi} on 2018-10-08.
 */
class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp = Math.min(height[i],height[j]) * (j - i);
                res = Math.max(temp,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(height));
    }
}
