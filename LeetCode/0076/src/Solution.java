import java.util.HashMap;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 * https://leetcode-cn.com/problems/minimum-window-substring/description/
 * Created by 老蹄子 on 2018/10/31 下午4:03
 */
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0){
            return "";
        }

        Map<Character,Integer> dicT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int count = dicT.getOrDefault(t.charAt(i),0);
            dicT.put(t.charAt(i),count + 1);
        }

        int required = dicT.size();
        int l = 0;
        int r = 0;
        int formed = 0;

        Map<Character,Integer> windowCounts = new HashMap<>();
        int[] ans = {-1,0,0}; //window length, left, right

        while (r < s.length()) {
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c,0);
            windowCounts.put(c,count + 1);

            if (dicT.containsKey(c) && windowCounts.get(c).intValue() == dicT.get(c).intValue()) {
                formed++;
            }
            while (l <= r && formed == required){
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]){
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                windowCounts.put(c,windowCounts.get(c) - 1);
                if (dicT.containsKey(c) && windowCounts.get(c).intValue() < dicT.get(c).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == - 1 ? "" : s.substring(ans[1],ans[2] + 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minWindow("ADOBECODEBANC","ABC"));
    }
}
