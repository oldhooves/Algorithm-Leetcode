/**
 * Created by 老蹄子 on 2018/10/24 上午11:06
 */
public class Solution2 {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        char chars1[] = num1.toCharArray();
        char chars2[] = num2.toCharArray();

        int result[] = new int[chars1.length + chars2.length];
        int n1[] = new int[chars1.length];
        int n2[] = new int[chars2.length];

        for(int i = 0; i < chars1.length;i++)
            n1[i] = chars1[i]-'0';
        for(int i = 0; i < chars2.length;i++)
            n2[i] = chars2[i]-'0';

        for(int i =0 ; i < chars1.length; i++){
            for(int j =0; j < chars2.length; j++){
                result[i + j] += n1[i] * n2[j];
            }
        }

        for(int i =result.length-1; i > 0 ;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }

        String resultStr = "";

        for(int i = 0; i < result.length-1; i++){
            resultStr += result[i];
        }

        return resultStr;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().multiply("123","456"));
    }
}
