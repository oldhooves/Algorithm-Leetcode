import java.util.Arrays;
import java.util.HashMap;

/**
 * 825. 适龄的朋友
 * https://leetcode-cn.com/problems/friends-of-appropriate-ages/description/
 * Created by 老蹄子 on 2018/10/16 下午8:54
 */
class Solution {

    public int numFriendRequests(int[] ages) {
        if (ages == null || ages.length <= 1){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        Arrays.sort(ages);
        for (int i = 0; i < ages.length; i++) {
            if (map.containsKey(ages[i])){
                ans += map.get(ages[i]);
                continue;
            }
            int sum = 0;
            for (int j = 0; j < ages.length && ages[j] <= ages[i]; j++) {
                if (i != j && success(ages[i],ages[j])){
                    ++sum;
                }
            }
            map.put(ages[i],sum);
            ans += sum;
        }
        return ans;
    }

    private boolean success(int A,int B){
        if (B <= 0.5 * A + 7){
            return false;
        }
        if (B > 100 && A < 100){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {20,30,100,110,120};
        System.out.println(new Solution().numFriendRequests(A));
    }
}
