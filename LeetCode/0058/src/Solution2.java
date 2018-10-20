/**
 * Created by 老蹄子 on 2018/10/20 下午10:47
 */
public class Solution2 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String a = s.trim();
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) != ' '){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
