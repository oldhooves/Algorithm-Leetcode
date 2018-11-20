import java.util.Arrays;

/**
 * 706. 设计哈希映射
 * https://leetcode-cn.com/problems/design-hashmap/description/
 * Created by 老蹄子 on 2018/11/20 下午1:22
 */
class MyHashMap {

    int[] map;

    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map,-1);
    }

    /** value will always be positive. */
    public void put(int key, int value) {
        map[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return map[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */