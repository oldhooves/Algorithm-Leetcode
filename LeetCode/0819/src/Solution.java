import java.util.*;

/**
 * 819. 最常见的单词
 * https://leetcode-cn.com/problems/most-common-word/description/
 * Created by 老蹄子 on 2018/10/21 下午10:27
 */
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String temp = "";
        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) != '.' && paragraph.charAt(i) != '!' && paragraph.charAt(i) != '?'
                    && paragraph.charAt(i) != ';' && paragraph.charAt(i) !='\''){
                if (paragraph.charAt(i) == ','){
                    temp += ' ';
                }else {
                    temp += paragraph.charAt(i);
                }
            }
        }
        String lowParagraph = temp.toLowerCase();

        String[] arr = lowParagraph.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else {
                map.put(arr[i],1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for (int i = 0; i < list.size(); i++) {
            if (!bannedContains(banned,list.get(i).getKey())){
                return list.get(i).getKey();
            }
        }
        return "";
    }

    private boolean bannedContains(String[] banned,String key){
        for (int i = 0; i < banned.length; i++) {
            if (banned[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};
        System.out.println(new Solution().mostCommonWord(paragraph,banned));
    }
}
