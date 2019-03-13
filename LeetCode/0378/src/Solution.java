import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 378. 有序矩阵中第K小的元素
 * https://leetcode-cn.com/classic/problems/kth-smallest-element-in-a-sorted-matrix/description/
 * Created by ${laotizi} on 2019-03-13.
 */
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> priorityQueue = new PriorityQueue<Tuple>();
        for (int j = 0; j < n; j++) {
            priorityQueue.offer(new Tuple(0,j,matrix[0][j]));
        }
        for (int i = 0; i < k - 1; i++) {
            Tuple t = priorityQueue.poll();
            if (t.x == n - 1) {
                continue;
            }
            priorityQueue.offer(new Tuple(t.x + 1,t.y,matrix[t.x + 1][t.y]));
        }
        return priorityQueue.poll().val;
    }

    class Tuple implements Comparable<Tuple> {
        int x,y,val;

        public Tuple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Tuple o) {
            return this.val - o.val;
        }
    }
}