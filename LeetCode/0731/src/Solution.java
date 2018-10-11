import java.util.ArrayList;
import java.util.List;

/**
 * 731. 我的日程安排表 II
 * https://leetcode-cn.com/problems/my-calendar-ii/description/
 * Created by 老蹄子 on 2018/10/11 下午8:58
 */
class MyCalendarTwo {

    List<int[]> calendar;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        calendar = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] iv : overlaps){
            if (iv[0] < end && iv[1] > start){
                return false;
            }
        }
        for (int[] iv : calendar){
            if (iv[0] < end && iv[1] > start){
                overlaps.add(new int[]{Math.max(start,iv[0]),Math.min(end,iv[1])});
            }
        }
        calendar.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
