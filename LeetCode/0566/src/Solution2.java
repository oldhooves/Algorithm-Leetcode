/**
 * Created by 老蹄子 on 2018/9/25 下午10:10
 */
class Solution2 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int rows = nums.length;
        int cols = nums[0].length;
        if (rows*cols != r*c)
        {
            return nums;
        }
        int[] tmp = new int[rows*cols];
        int k = 0;
        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<cols; j++)
            {
                tmp[k]=nums[i][j];
                k++;
            }
        }
        int[][] newMatrix = new int[r][c];
        k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0; j<c; j++)
            {
                newMatrix[i][j]=tmp[k];
                k++;
            }
        }
        return newMatrix;
    }
}
