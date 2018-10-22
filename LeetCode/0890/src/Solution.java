import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 890. 查找和替换模式
 * https://leetcode-cn.com/problems/find-and-replace-pattern/description/
 * Created by 老蹄子 on 2018/10/22 下午8:02
 */
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words){
            if (match(word,pattern)){
                res.add(word);
            }
        }
        return res;
    }

    private boolean match(String word,String pattern){
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!map1.containsKey(w)){
                map1.put(w,p);
            }
            if (!map2.containsKey(p)){
                map2.put(p,w);
            }
            if (map1.get(w) != p || map2.get(p) != w){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String[] words = {"t","k","g","n","k"};
        String pattern = "v";
        System.out.println(new Solution().findAndReplacePattern(words,pattern));
    }
}
