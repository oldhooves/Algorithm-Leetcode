import sun.java2d.pipe.SolidTextRenderer;

/**
 * 824. 山羊拉丁文
 * https://leetcode-cn.com/problems/goat-latin/description/
 * Created by 老蹄子 on 2018/10/18 下午1:30
 */
class Solution {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] words = S.split(" ");
        char[] map = new char[256];
        map['A'] = map['E'] = map['I'] = map['O'] = map['U'] =  1;
        map['a'] = map['e'] = map['i'] = map['o'] = map['u'] =  1;
        StringBuilder as = new StringBuilder("a");
        for (int i = 0; i < words.length; i++) {
            if (map[words[i].charAt(0)] == 1){
                sb.append(words[i]).append("ma");
            }else {
                sb.append(words[i].substring(1)).append(words[i].charAt(0)).append("ma");
            }
            sb.append(as);
            as.append("a");
            if (i != words.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().toGoatLatin("I speak Goat Latin"));
    }
}
