import java.util.Arrays;

/**
 * 406. 根据身高重建队列
 * https://leetcode-cn.com/classic/problems/queue-reconstruction-by-height/description/
 * Created by ${laotizi} on 2019-03-20.
 */
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        int[][] res = new int[people.length][2];
        for (int i = 0; i < people.length; i++) {
            int pos = people[i][1];
            for (int j = i; j > pos; j--) {
                res[j] = res[j - 1];
            }
            res[pos] = people[i];
        }
        return res;
    }
}