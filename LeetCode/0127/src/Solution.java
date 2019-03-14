import java.util.*;

/**
 * 127. 单词接龙
 * https://leetcode-cn.com/classic/problems/word-ladder/description/
 * Created by 老蹄子 on 2019/3/14 下午8:48
 */
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>(wordList);
        if (!dictionary.contains(endWord)) {
            return 0;
        }
        int minLength = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        visited.add(beginWord);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            minLength += levelSize != 0 ? 1 : 0;
            for (int i = 0; i < levelSize; i++) {
                String current = queue.poll();
                if (current.equals(endWord)) {
                    return minLength;
                } else {
                    char[] currentChars = current.toCharArray();
                    for (int j = 0; j < currentChars.length; j++) {
                        char preChar = currentChars[j];
                        for (char nextChar = 'a'; nextChar <= 'z';nextChar++) {
                            currentChars[j] = nextChar;
                            String nextWord = new String(currentChars);
                            if (dictionary.contains(nextWord) && !visited.contains(nextWord)) {
                                queue.offer(nextWord);
                                visited.add(nextWord);
                            }
                        }
                        currentChars[j] = preChar;
                    }
                }
            }
        }
        return 0;
    }
}
