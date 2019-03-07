/**
 * 733. 图像渲染
 * https://leetcode-cn.com/problems/flood-fill/description/
 * Created by ${laotizi} on 2019-03-07.
 */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }
        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image,sr + 1,sc,color,newColor);
        fill(image,sr - 1,sc,color,newColor);
        fill(image,sr,sc + 1,color,newColor);
        fill(image,sr,sc - 1,color,newColor);
    }
}