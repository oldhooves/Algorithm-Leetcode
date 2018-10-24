/**
 * 848. 字母移位
 * https://leetcode-cn.com/problems/shifting-letters/description/
 * Created by 老蹄子 on 2018/10/24 下午7:40
 */
class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        char[] arr = S.toCharArray();
        int shift = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            arr[i] = (char)((arr[i] - 'a' + shift) % 26 + 'a');
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String S = "abc";
        int[] shifts = {3,5,9};
        System.out.println(new Solution().shiftingLetters(S,shifts));
    }
}