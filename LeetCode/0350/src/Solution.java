import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * 350. 两个数组的交集 II
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/description/
 * Created by 老蹄子 on 2018/8/24 上午9:03
 */
class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums1){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2){
            if (map.containsKey(num)){
                list.add(num);
                map.put(num,map.get(num)-1);
                if (map.get(num) == 0){
                    map.remove(num);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0;i < list.size();i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
