import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 * https://leetcode-cn.com/problems/self-dividing-numbers/description/
 * Created by 老蹄子 on 2018/11/7 下午4:11
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (helper(i)){
                res.add(i);
            }
        }
        return res;
    }

    private boolean helper(int n) {
        for (char c : String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0')) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(1,22));
    }
}
