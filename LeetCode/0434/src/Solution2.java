/**
 * Created by 老蹄子 on 2018/10/21 下午9:08
 */
public class Solution2 {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countSegments(", , , ,        a, eaefa"));
    }
}
