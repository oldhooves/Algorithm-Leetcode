import java.util.Stack;

/**
 * 316. 去除重复字母
 * https://leetcode-cn.com/classic/problems/remove-duplicate-letters/description/
 * Created by ${laotizi} on 2019-03-19.
 */
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] res = new int[26];
        boolean[] visited = new boolean[26];
        char[] ch = s.toCharArray();
        for (char c : ch) {
            res[c - 'a']++;
        }
        Stack<Character> stack = new Stack<>();
        int index;
        for (char c : ch) {
            index = c - 'a';
            res[index]--;
            if (visited[index]) {
                continue;
            }
            while (!stack.isEmpty() && c < stack.peek() && res[stack.peek() - 'a'] != 0) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            visited[index] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}