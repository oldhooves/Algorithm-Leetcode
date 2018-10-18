/**
 * Created by 老蹄子 on 2018/10/18 下午7:47
 */
class Solution2 {
    public int countBinarySubstrings(String s) {
        //边界处理
        if(null == s || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int count = 0;
        int pre = 0;
        int cur = 1;

        for(int i=1; i<len; i++) {
            if(s.charAt(i) -s.charAt(i-1)==0) {
                cur++;
            } else {
                pre = cur;
                cur = 1;
            }
            if(pre >= cur) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().countBinarySubstrings("00110011"));
    }
}
