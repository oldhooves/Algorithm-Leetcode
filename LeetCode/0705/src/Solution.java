/**
 * 705. 设计哈希集合
 * https://leetcode-cn.com/problems/design-hashset/description/
 * Created by 老蹄子 on 2018/11/20 下午2:22
 */
class MyHashSet {

    private int buckets = 1000;
    private int itemsPerBucket = 1001;
    private boolean[][] table;

    /** Initialize your data structure here. */
    public MyHashSet() {
        table = new boolean[buckets][];
    }

    public void add(int key) {
        int hashKey = hash(key);
        if (table[hashKey] == null) {
            table[hashKey] = new boolean[itemsPerBucket];
        }
        table[hashKey][pos(key)] = true;
    }

    public void remove(int key) {
        int hashKey = hash(key);
        if (table[hashKey] != null) {
            table[hashKey][pos(key)] = false;
        }
    }

    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
        int hashKey = hash(key);
        return table[hashKey] != null && table[hashKey][pos(key)];
    }

    public int hash(int key) {
        return key % buckets;
    }

    public int pos(int key) {
        return key / buckets;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
