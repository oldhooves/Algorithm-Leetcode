/**
 * 670. 最大交换
 * https://leetcode-cn.com/problems/maximum-swap/description/
 * Created by 老蹄子 on 2018/10/15 下午2:15
 */
class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        if (digits.length == 1){
            return num;
        }

        int split = 0;
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] < digits[i + 1]){
                split = i + 1;
                break;
            }
        }

        char max = digits[split];
        int index1 = split;
        for (int j = split + 1; j < digits.length; j++) {
            if (digits[j] >= max){
                max = digits[j];
                index1 = j;
            }
        }

        int index2 = split;
        for (int i = split - 1; i >= 0; i--) {
            if (digits[i] >= max){
                break;
            }
            index2--;
        }

        char temp = digits[index1];
        digits[index1] = digits[index2];
        digits[index2] = temp;
        return Integer.valueOf(new String(digits));
    }
}
