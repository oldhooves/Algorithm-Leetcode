/**
 * 551. 学生出勤纪录 I
 * https://leetcode-cn.com/problems/student-attendance-record-i/description/
 * Created by 老蹄子 on 2018/10/18 下午4:44
 */
class Solution {
    public boolean checkRecord(String s) {
        boolean absent = true;
        boolean late = true;
        char[] ch = s.toCharArray();
        int countAbsent = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A'){
                countAbsent++;
            }
        }
        if (countAbsent > 1){
            absent = false;
        }
        for (int i = 0; i < ch.length - 2; i++) {
            if (ch[i] == 'L' && ch[i + 1] == 'L' && ch[i + 2] == 'L'){
                late = false;
                break;
            }
        }
        if (absent && late){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkRecord("PPALLL"));
    }
}
