import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 895. 最大频率栈
 * https://leetcode-cn.com/problems/maximum-frequency-stack/description/
 * Created by 老蹄子 on 2019/2/6 下午9:16
 */
class FreqStack {

    Map<Integer,Integer> freq;
    Map<Integer,Stack<Integer>> m;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        m = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int x) {
        int f = freq.getOrDefault(x,0) + 1;
        freq.put(x,f);
        maxFreq = Math.max(maxFreq,f);
        if (!m.containsKey(f)) {
            m.put(f,new Stack<Integer>());
        }
        m.get(f).add(x);
    }

    public int pop() {
        int x = m.get(maxFreq).pop();
        freq.put(x,maxFreq - 1);
        if (m.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */