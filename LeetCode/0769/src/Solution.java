/**
 * 769. 最多能完成排序的块
 * https://leetcode-cn.com/problems/max-chunks-to-make-sorted/description/
 * Created by 老蹄子 on 2018/10/11 下午3:26
 */
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            if (max == i){
                count++;
            }
        }
        return count;
    }


}