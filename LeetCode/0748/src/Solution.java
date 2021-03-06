/**
 * 748. 最短完整词
 * https://leetcode-cn.com/problems/shortest-completing-word/description/
 * Created by 老蹄子 on 2018/11/21 下午9:54
 */
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String target = licensePlate.toLowerCase();
        int[] charMap = new int[26];
        for (int i = 0; i < target.length(); i++) {
            if (Character.isLetter(target.charAt(i))) {
                charMap[target.charAt(i) - 'a']++;
            }
        }
        int minLength = Integer.MAX_VALUE;
        String result = null;
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (matches(word, charMap) && word.length() < minLength) {
                minLength = word.length();
                result = words[i];
            }
        }
        return result;
    }

    private boolean matches(String word, int[] charMap) {
        int[] targetMap = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                targetMap[word.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (charMap[i] != 0 && targetMap[i] < charMap[i]) {
                return false;
            }
        }
        return true;
    }
}
