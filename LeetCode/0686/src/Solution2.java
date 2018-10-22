/**
 * Created by 老蹄子 on 2018/10/22 下午2:22
 */
public class Solution2 {
    public int repeatedStringMatch(String A, String B) {
        StringBuffer sb = new StringBuffer();
        sb.append(A);
        int num = 1;
        while(sb.length() < B.length()){
            sb.append(A);
            num++;
        }
        if (sb.indexOf(B) != -1){
            return num;
        }
        sb.append(A);
        num++;
        if (sb.indexOf(B) != -1){
            return num;
        }
        return -1;
    }
}
