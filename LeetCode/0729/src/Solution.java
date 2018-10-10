import java.util.ArrayList;
import java.util.List;

/**
 * 729. 我的日程安排表 I
 * https://leetcode-cn.com/problems/my-calendar-i/description/
 * Created by 老蹄子 on 2018/10/10 下午4:54
 */
class MyCalendar {

    class Node{
        public int start;
        public int end;
        public Node(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    private List<Node> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (list.size() == 0){
            list.add(new Node(start,end));
            return true;
        }
        for (Node node : list){
            if (!(end <= node.start || start >= node.end)){
                return false;
            }
        }
        list.add(new Node(start,end));
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
