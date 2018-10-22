/**
 * 443. 压缩字符串
 * https://leetcode-cn.com/problems/string-compression/description/
 * Created by 老蹄子 on 2018/10/22 下午3:21
 */
class Solution {
    public int compress(char[] chars) {
        int indexAns = 0;
        int index = 0;
        while (index < chars.length) {
            char currentChar = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if (count != 1){
                for (char c : Integer.toString(count).toCharArray()){
                    chars[indexAns++] = c;
                }
            }
        }
        return indexAns;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(new Solution().compress(chars));
    }
}