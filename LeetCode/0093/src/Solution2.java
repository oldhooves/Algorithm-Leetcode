import java.util.ArrayList;
import java.util.List;

/**
 * Created by 老蹄子 on 2018/10/23 下午5:10
 */
public class Solution2 {
    public List<String> restoreIpAddresses(String s) {
        List<String> solutions = new ArrayList<>();
        restoreIp(s,solutions,0,"",0);
        return solutions;
    }

    private void restoreIp(String ip,List<String> solutions,int idx,String restored,int count){
        if (count > 4){
            return;
        }
        if (count == 4 && idx == ip.length()){
            solutions.add(restored);
        }
        for (int i = 1; i < 4; i++) {
            if (idx + i > ip.length()) {
                break;
            }
            String s = ip.substring(idx,idx + i);
            if ((s.startsWith("0") && s.length() > 1) || Integer.parseInt(s) > 255){
                continue;
            }
            restoreIp(ip,solutions,idx + i,restored + s + (count == 3 ? "" : "."),count + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().restoreIpAddresses("25525511135"));
    }
}
