import java.util.LinkedList;
import java.util.List;

/**
 * 906. 超级回文数
 * https://leetcode-cn.com/problems/super-palindromes/description/
 * Created by 老蹄子 on 2018/11/16 下午4:03
 */
class Solution {

    public int superpalindromesInRange(String L, String R) {
        Long l = Long.valueOf(L);
        Long r = Long.valueOf(R);
        int result = 0;
        for (long i = (long) Math.sqrt(l); i * i <= r; ) {
            long p = nextPalindrome(i);
            if (p * p <= r && isPalindrome(p * p)) {
                result++;
            }
            i = p + 1;
        }
        return result;
    }

    private long nextPalindrome(long l) {
        String s = "" + l;
        int len = s.length();
        List<Long> cands = new LinkedList<>();
        cands.add((long)Math.pow(10, len) - 1);
        String half = s.substring(0, (len + 1) / 2);
        String nextHalf = "" + (Long.valueOf(half) + 1);
        String reverse = new StringBuilder(half.substring(0, len / 2)).reverse().toString();
        String nextReverse = new StringBuilder(nextHalf.substring(0, len / 2)).reverse().toString();
        cands.add(Long.valueOf(half + reverse));
        cands.add(Long.valueOf(nextHalf + nextReverse));
        long result = Long.MAX_VALUE;
        for (long i : cands) {
            if (i >= l) {
                result = Math.min(result, i);
            }
        }
        return result;
    }

    private boolean isPalindrome(long l) {
        String s = "" + l;
        int i = 0,j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().nextPalindrome(54321));
    }
}