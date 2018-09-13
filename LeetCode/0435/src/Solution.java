import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. 无重叠区间
 * https://leetcode-cn.com/problems/non-overlapping-intervals/description/
 * Created by 老蹄子 on 2018/9/13 下午9:48
 */
class Solution {

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public int eraseOverlapIntervals(Interval[] intervals) {

        if (intervals.length == 0){
            return 0;
        }

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.end != o2.end){
                    return o1.end - o2.end;
                }
                return o1.start - o2.start;
            }
        });

        int res = 1;
        int pre = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= intervals[pre].end){
                res ++;
                pre = i;
            }
        }
        return intervals.length - res;
    }
}
