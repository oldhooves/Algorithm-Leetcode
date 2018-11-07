/**
 * Created by 老蹄子 on 2018/11/7 下午5:04
 */
public class Solution2 {

    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
}