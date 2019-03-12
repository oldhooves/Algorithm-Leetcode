/**
 * 744. 寻找比目标字母大的最小字母
 * Created by 老蹄子 on 2019/3/12 下午10:14
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (letters[mid] <= target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low == letters.length ? letters[0] : letters[low];
    }
}