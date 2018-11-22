import java.util.*;

/**
 * 648. 单词替换
 * https://leetcode-cn.com/problems/replace-words/description/
 * Created by 老蹄子 on 2018/11/22 下午2:37
 */
class Solution {
    public String replaceWords(List<String> dict, String sentence) {

        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < dict.size(); j++) {
                if (split[i].startsWith(dict.get(j))) {
                    split[i] = dict.get(j);
                    break;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
