/**
 * 38. 报数
 * https://leetcode-cn.com/problems/count-and-say/description/
 * Created by 老蹄子 on 2018/10/18 下午4:24
 */
class Solution {
    public String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        StringBuilder s = new StringBuilder("1");
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n; i++) {
            char temp = s.charAt(0);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (temp == s.charAt(j)){
                    count++;
                }else {
                    result.append(count);
                    result.append(temp);
                    temp = s.charAt(j);
                    count = 1;
                }
            }
            result.append(count);
            result.append(temp);
            s = result;
            result = new StringBuilder();
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(4));
    }
}
