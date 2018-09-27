import java.util.Arrays;

/**
 * 66. 加一
 * https://leetcode-cn.com/problems/plus-one/description/
 * Created by 老蹄子 on 2018/9/27 下午7:56
 */
class Solution {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }



    public static void main(String[] args) {
        int[] digits = {1,9,9};
        int[] result = new Solution().plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
