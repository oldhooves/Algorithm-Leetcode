/**
 * Created by 老蹄子 on 2018/11/21 下午8:00
 */
public class Solution2 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int[] stack = new int[temperatures.length]; // 数组模拟栈
        int count = -1; // 栈顶
        for (int i = 0; i < temperatures.length - 1; i++) {
            if (temperatures[i] < temperatures[i + 1]) {
                res[i] = 1;
                while (count > -1) {
                    int top = stack[count];
                    if (temperatures[top] < temperatures[i + 1]) {
                        res[top] = i + 1 - top;
                        count--;
                    } else {
                        break;
                    }
                }
            }else {
                stack[++count] = i;
            }
        }
        return res;
    }
}
