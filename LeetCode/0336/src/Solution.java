import java.util.*;

/**
 * 336. 回文对
 * https://leetcode-cn.com/problems/palindrome-pairs/description/
 * Created by 老蹄子 on 2018/11/1 下午2:50
 * Case1: If s1 is a blank string, then for any string that is palindrome s2, s1+s2 and s2+s1 are palindrome.
   Case 2: If s2 is the reversing string of s1, then s1+s2 and s2+s1 are palindrome.
   Case 3: If s1[0:cut] is palindrome and there exists s2 is the reversing string of s1[cut+1:] , then s2+s1 is palindrome.
   Case 4: Similiar to case3. If s1[cut+1: ] is palindrome and there exists s2 is the reversing string of s1[0:cut] , then s1+s2 is palindrome.
 */
class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        if (words == null || words.length == 0) {
            return res;
        }
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],i);
        }

        if (map.containsKey("")){
            int blankIndex = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (isPalindrome(words[i])){
                    if (i == blankIndex) {
                        continue;
                    }
                    res.add(Arrays.asList(blankIndex,i));
                    res.add(Arrays.asList(i,blankIndex));
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            String cur_reverse = reverseStr(words[i]);
            if (map.containsKey(cur_reverse)){
                int reverseIndex = map.get(cur_reverse);
                if (reverseIndex == i){
                    continue;
                }
                res.add(Arrays.asList(i,reverseIndex));
            }
        }

        for (int i = 0; i < words.length; i++) {
            String cur = words[i];
            for (int cut = 1; cut < cur.length(); cut++) {
                if (isPalindrome(cur.substring(0, cut))) {
                    String cut_r = reverseStr(cur.substring(cut));
                    if (map.containsKey(cut_r)){
                        int found = map.get(cut_r);
                        if (found == i){
                            continue;
                        }
                        res.add(Arrays.asList(found,i));
                    }
                }
                if (isPalindrome(cur.substring(cut))){
                    String cur_r = reverseStr(cur.substring(0,cut));
                    if (map.containsKey(cur_r)){
                        int found = map.get(cur_r);
                        if (found == i){
                            continue;
                        }
                        res.add(Arrays.asList(i,found));
                    }
                }
            }
        }
        return res;
    }

    private String reverseStr(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcd","dcba","lls","s","sssll"};
        System.out.println(new Solution().palindromePairs(words));
    }
}

