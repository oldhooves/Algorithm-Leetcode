/**
 * Created by ${laotizi} on 2018-10-08.
 */
public class Solution2 {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length - 1;
        int maxArea = 0;
        while (l < r){
            maxArea = Math.max(maxArea,Math.min(height[l],height[r]) * (r - l));
            if (height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }
}