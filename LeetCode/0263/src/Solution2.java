/**
 * Created by 老蹄子 on 2018/11/7 下午9:51
 */
public class Solution2 {
    public boolean isUgly(int num) {
        if(num==1){
            return true;
        }
        if(num<=0){
            return false;
        }

        while(num%2==0){
            num = num/2;
        }
        while(num%3==0){
            num = num/3;
        }
        while(num%5==0){
            num = num/5;
        }
        if(num==1){
            return true;
        }
        return false;
    }
}
