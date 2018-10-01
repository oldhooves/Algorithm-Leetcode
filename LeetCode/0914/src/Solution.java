import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 914. 卡牌分组
 * https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/description/
 * Created by 老蹄子 on 2018/10/1 下午7:58
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])){
                map.put(deck[i],map.get(deck[i]) + 1);
            }else {
                map.put(deck[i],1);
            }
        }
        for (Integer i : map.keySet()){
            list.add(map.get(i));
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] != result[i + 1]){
                flag = false;
            }
        }


        if (flag && result[0] == 1){
            return false;
        }else if (flag && result[0] != 1){
            return true;
        }
        else {
            int res = gcdArray(result);
            if (res == 1){
                return false;
            }
            return true;
        }

    }

    private int gcdArray(int[] ints){
        if (ints.length == 1){
            return ints[0];
        }
        int index = 1;
        int re = ints[0];
        while (index < ints.length){
            re = gcd(re,ints[index]);
            index++;
        }
        return re;
    }

    private int gcd(int m, int n) {

        int result = 0;
        while (n != 0){
            result = m % n;
            m = n;
            n = result;
        }
        return m;
    }

    public static void main(String[] args) {
        int[] deck = {1,1,2,2,2,2};
        System.out.println(new Solution().hasGroupsSizeX(deck));
    }
}

