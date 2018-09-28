/**
 * 717. 1比特与2比特字符
 * https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/description/
 * Created by 老蹄子 on 2018/9/28 下午7:23
 */
class Solution {

    public boolean isOneBitCharacter(int[] bits) {

        int len = bits.length;
        int i;
        for (i = 0; i< len - 1; i++) {
            if (bits[i] == 1){
                i += 1;
            }
        }
        return i == len - 1;
    }
}
