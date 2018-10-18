/**
 * Created by 老蹄子 on 2018/10/18 下午4:51
 */
public class Solution2 {
    public boolean checkRecord(String s) {
        if (s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL")){
            return false;
        }
        return true;
    }
}
