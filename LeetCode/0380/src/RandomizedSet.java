import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * 380. 常数时间插入、删除和获取随机元素
 * https://leetcode-cn.com/problems/insert-delete-getrandom-o1/description/
 * Created by 老蹄子 on 2018/10/9 下午8:58
 */
class RandomizedSet {

    private HashMap<Integer,Integer> map;
    private ArrayList<Integer> nums;
    private Random random = new Random();

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {

        boolean isContain = map.containsKey(val);

        if (isContain){
            return false;
        }

        map.put(val,nums.size());
        nums.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        boolean isContain = map.containsKey(val);
        if (!isContain){
            return false;
        }
        int valIndex = map.get(val);
        if (valIndex != nums.size() - 1){
            int lastNum = nums.get(nums.size() - 1);
            nums.set(valIndex,lastNum);
            map.put(lastNum,valIndex);
        }
        map.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */