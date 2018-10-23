import java.util.Arrays;
import java.util.List;

/**
 * 539. 最小时间差
 * https://leetcode-cn.com/problems/minimum-time-difference/description/
 * Created by 老蹄子 on 2018/10/23 下午7:07
 */
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int N = timePoints.size();
        int[] minuteArr = new int[N];
        int i = 0;
        for (String timePoint : timePoints){
            minuteArr[i++] = toMinutes(timePoint);
        }
        Arrays.sort(minuteArr);
        int min = 24 * 60 + minuteArr[0] - minuteArr[N - 1];
        for (int j = 1; j < N; j++) {
            min = Math.min(min,minuteArr[j] - minuteArr[j - 1]);
        }
        return min;
    }

    private int toMinutes(String time) {
        String[] arr = time.split(":");
        return (Integer.parseInt(arr[0]) * 60) + Integer.parseInt(arr[1]);
    }

}
