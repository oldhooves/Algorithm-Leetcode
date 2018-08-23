import java.util.TreeSet;

/**
 * 804. 唯一摩尔斯密码词
 * https://leetcode-cn.com/problems/unique-morse-code-words/description/
 * Created by 老蹄子 on 2018/8/23 下午9:25
 */
class Solution {

    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        TreeSet<String> set = new TreeSet<>();
        for (String word : words){

            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < word.length();i++){
                sb.append(codes[word.charAt(i) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
