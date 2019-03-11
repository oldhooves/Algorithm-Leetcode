import java.util.LinkedList;
import java.util.Queue;

/**
 * 210. 课程表 II
 * https://leetcode-cn.com/classic/problems/course-schedule-ii/description/
 * Created by ${laotizi} on 2019-03-08.
 */
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        int[] order = new int[numCourses];
        int index = 0;

        for (int i = 0; i < prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0) {
                indegree[ready]++;
            }
            matrix[pre][ready] = 1;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                order[index++] = i;
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int course = queue.poll();
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0) {
                        order[index++] = i;
                        queue.offer(i);
                    }
                }
            }
        }
        return (index == numCourses) ? order : new int[0];
    }
}