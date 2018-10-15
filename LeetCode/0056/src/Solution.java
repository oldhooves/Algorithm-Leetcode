import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 * https://leetcode-cn.com/problems/merge-intervals/description/
 * Created by 老蹄子 on 2018/10/15 下午2:47
 */

class Interval {
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
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
       List<Interval> list = new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        if (intervals.size() == 0){
            return list;
        }
        Interval i1 = intervals.get(0);
        for (int i = 0; i < intervals.size(); i++) {
            Interval i2;
            if (i == intervals.size() - 1){
                i2 = new Interval(Integer.MAX_VALUE,Integer.MAX_VALUE);
            }else {
                i2 = intervals.get(i + 1);
            }
            if (i2.start >= i1.start && i2.start <= i1.end){
                i1.end = Math.max(i1.end,i2.end);
            }else {
                list.add(i1);
                i1 = i2;
            }
        }
        return list;

    }
}
