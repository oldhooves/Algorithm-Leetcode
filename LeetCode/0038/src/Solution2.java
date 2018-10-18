/**
 * Created by 老蹄子 on 2018/10/18 下午4:37
 */
public class Solution2 {
    public String countAndSay(int n) {
        String str="1";
        while(--n > 0){
            StringBuilder sb = new StringBuilder();
            int times=1;
            char[] chars = str.toCharArray();
            int len = chars.length;
            for(int i = 1; i < len; i++){
                if(chars[i-1]==chars[i]){
                    times++;
                }else {
                    sb.append(times).append(chars[i-1]);
                    times = 1;
                }
            }
            str = sb.append(times).append(chars[len-1]).toString();
        }
        return str;
    }
}
