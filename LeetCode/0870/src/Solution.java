import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 870. 优势洗牌
 * https://leetcode-cn.com/classic/problems/advantage-shuffle/description/
 * Created by ${laotizi} on 2019-03-22.
 */
class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int n = A.length;
        int[] res = new int[n];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for (int i = 0; i < n; i++) {
            priorityQueue.add(new int[]{B[i],i});
        }
        int lo = 0,hi = n - 1;
        while (!priorityQueue.isEmpty()) {
            int[] cur = priorityQueue.poll();
            int idx = cur[1],val = cur[0];
            if (A[hi] > val) {
                res[idx] = A[hi--];
            } else {
                res[idx] = A[lo++];
            }
        }
        return res;
    }
}