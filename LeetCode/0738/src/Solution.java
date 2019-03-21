/**
 * 738. 单调递增的数字
 * https://leetcode-cn.com/classic/problems/monotone-increasing-digits/description/
 * Created by ${laotizi} on 2019-03-21.
 */
class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] chars = String.valueOf(N).toCharArray();
        int mark = chars.length;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] < chars[i - 1]) {
                mark = i - 1;
                chars[i - 1]--;
            }
        }
        for (int i = mark + 1; i < chars.length; i++) {
            chars[i] = '9';
        }
        return Integer.valueOf(new String(chars));
    }
}