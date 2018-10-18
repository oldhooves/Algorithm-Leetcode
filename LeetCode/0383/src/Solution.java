/**
 * 383. 赎金信
 * https://leetcode-cn.com/problems/ransom-note/description/
 * Created by 老蹄子 on 2018/10/18 下午9:46
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("aa","aab"));
    }
}
