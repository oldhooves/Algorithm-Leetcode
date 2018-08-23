import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 349. 两个数组的交集
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/description/
 * Created by 老蹄子 on 2018/8/23 下午11:02
 */
class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0;i < nums1.length;i++){
            set.add(nums1[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2){
            if (set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0;i < list.size();i++){
            res[i] = list.get(i);
        }
        return res;

    }
}
