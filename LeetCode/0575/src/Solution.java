import java.util.HashSet;
import java.util.Set;

/**
 * 575. 分糖果
 * https://leetcode-cn.com/problems/distribute-candies/description/
 * Created by 老蹄子 on 2018/11/19 下午10:57
 */
class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>(candies.length);
        for (int candy : candies) {
            set.add(candy);
        }
        return set.size() >= candies.length / 2 ? candies.length / 2 : set.size();
    }
}