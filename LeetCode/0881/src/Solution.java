import java.util.Arrays;

/**
 * 881. 救生艇
 * https://leetcode-cn.com/classic/problems/boats-to-save-people/description/
 * Created by ${laotizi} on 2019-03-22.
 */
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0,j = people.length - 1;
        int ans = 0;
        while (i <= j) {
            ans ++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return ans;
    }
}