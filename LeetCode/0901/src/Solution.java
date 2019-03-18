import java.util.Deque;
import java.util.Stack;

/**
 * 901. 股票价格跨度
 * https://leetcode-cn.com/classic/problems/online-stock-span/description/
 * Created by ${laotizi} on 2019-03-18.
 */
class StockSpanner {
    Stack<Integer> prices;
    Stack<Integer> weights;

    public StockSpanner() {
        prices = new Stack<>();
        weights = new Stack<>();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek()<= price) {
            prices.pop();
            w += weights.pop();
        }
        prices.push(price);
        weights.push(w);
        return w;
    }
}
