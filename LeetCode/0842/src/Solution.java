import java.util.ArrayList;
import java.util.List;

/**
 * 842. 将数组拆分成斐波那契序列
 * https://leetcode-cn.com/problems/split-array-into-fibonacci-sequence/description/
 * Created by 老蹄子 on 2018/10/24 下午2:45
 */
class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> ans = new ArrayList<>();
        helper(S,ans,0);
        return ans;
    }

    private boolean helper(String s,List<Integer> ans ,int idx){
        if (idx == s.length() && ans.size() >= 3){
            return true;
        }
        for (int i = idx; i < s.length(); i++) {
            if (s.charAt(idx) == '0' && i > idx){
                break;
            }
            long num = Long.parseLong(s.substring(idx,i + 1));
            if (num > Integer.MAX_VALUE){
                break;
            }
            int size = ans.size();
            if (size >= 2 && num > ans.get(size - 1) + ans.get(size - 2)){
                break;
            }
            if (size <= 1 || num == ans.get(size - 1) + ans.get(size - 2)){
                ans.add((int)num);
                if (helper(s,ans,i + 1)){
                    return true;
                }
                ans.remove(ans.size() - 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().splitIntoFibonacci("11235813"));
    }
}
