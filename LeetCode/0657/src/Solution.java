/**
 * 657. 机器人能否返回原点
 * https://leetcode-cn.com/problems/robot-return-to-origin/description/
 * Created by 老蹄子 on 2018/10/17 下午4:34
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R'){
                r++;
            }else if (moves.charAt(i) == 'L'){
                l++;
            }else if (moves.charAt(i) == 'U'){
                u++;
            }else {
                d++;
            }
        }
        if (r == l && u == d){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(new Solution().judgeCircle(moves));
    }
}
