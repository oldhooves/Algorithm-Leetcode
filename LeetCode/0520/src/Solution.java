/**
 * 520. 检测大写字母
 * https://leetcode-cn.com/problems/detect-capital/description/
 * Created by 老蹄子 on 2018/10/18 下午1:40
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        boolean upFlag = true;
        boolean lowFlag = true;
        for (int i = 0; i < ch.length; i++) {
            if (!(ch[i] >= 'A' && ch[i] <= 'Z')){
                upFlag = false;
                break;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (!(ch[i] >= 'a' && ch[i] <= 'z')){
                lowFlag = false;
                break;
            }
        }
        if (upFlag || lowFlag){
            return true;
        }else {
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] >= 'A' && ch[i] <= 'Z'){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().detectCapitalUse("FlaG"));
    }
}
