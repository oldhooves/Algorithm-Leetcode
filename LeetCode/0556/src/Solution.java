import java.util.Arrays;

/**
 * 556. 下一个更大元素 III
 * https://leetcode-cn.com/problems/next-greater-element-iii/description/
 * Created by 老蹄子 on 2018/10/25 下午2:34
 */
class Solution {
    public int nextGreaterElement(int n) {
        char[] number = (n + "").toCharArray();
        int i,j;
        for (i = number.length - 1; i > 0; i--) {
            if (number[i - 1] < number[i]){
                break;
            }
        }
        if (i == 0){
            return -1;
        }

        for (j = number.length - 1; j >= i; j--) {
            if (number[j] > number[i - 1]){
                char temp = number[i - 1];
                number[i - 1] = number[j];
                number[j] = temp;
                break;
            }
        }
        Arrays.sort(number,i,number.length);
        long val = Long.parseLong(new String(number));

        return (val < Integer.MAX_VALUE) ? (int) val : -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().nextGreaterElement(12443322));
    }
}
