/**
 * 299. 猜数字游戏
 * https://leetcode-cn.com/problems/bulls-and-cows/description/
 * Created by 老蹄子 on 2018/11/22 下午5:25
 */
class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int[] secretArr = new int[10];
        int[] guessArr = new int[10];
        int bull = 0,cow = 0;
        for (int i = 0; i < len; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }else {
                secretArr[secret.charAt(i) - '0']++;
                guessArr[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            cow += Math.min(secretArr[i],guessArr[i]);
        }
        return "" + bull + "A" + cow + "B";
    }
}