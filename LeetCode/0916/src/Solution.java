import java.util.ArrayList;
import java.util.List;

/**
 * 916. 单词子集
 * https://leetcode-cn.com/problems/word-subsets/description/
 * Created by 老蹄子 on 2018/10/24 下午1:11
 */
class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] bmax = count("");
        for (String b : B){
            int[] bcount = count(b);
            for (int i = 0; i < 26; i++) {
                bmax[i] = Math.max(bmax[i],bcount[i]);
            }
        }

        List<String> ans = new ArrayList<>();

        for (String a : A){
            int[] acount = count(a);
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (acount[i] < bmax[i]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                ans.add(a);
            }
        }
        return ans;
    }

    private int[] count(String str){
        int[] ans = new int[26];
        for (char c : str.toCharArray()){
            ans[c - 'a']++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"amazon","apple","facebook","google","leetcode"};
        String[] B = {"ec","oc","ceo"};
        System.out.println(new Solution().wordSubsets(A,B));
    }
}