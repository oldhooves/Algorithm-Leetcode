/**
 * 459. 重复的子字符串
 * https://leetcode-cn.com/problems/repeated-substring-pattern/description/
 * Created by 老蹄子 on 2018/10/19 下午4:25
 */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int i = 1;
        boolean flag = false;
        while (i <= len / 2){
            if (len % i == 0){
                flag = check(s,i);
            }
            i++;
            if (flag){
                break;
            }
        }
        return flag;
    }
    private boolean check(String s,int distance){
        int len = s.length();
        for (int i = 0; i < distance; i++) {
            for (int j = i + distance; j < len; j += distance) {
                if (s.charAt(i) != s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
