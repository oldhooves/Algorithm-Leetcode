
import java.util.*;

/**
 * 347. 前K个高频元素
 * https://leetcode-cn.com/problems/top-k-frequent-elements/description/
 * Created by 老蹄子 on 2018/8/24 下午5:01
 */
class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }
            else {
                map.put(num,1);
            }
        }


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (int key : map.keySet()){
            if (priorityQueue.size() < k){
                priorityQueue.add(key);
            }else if (map.get(key) > map.get(priorityQueue.peek())){
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }

        LinkedList<Integer> result = new LinkedList<>();
        while (!priorityQueue.isEmpty()){
            result.add(priorityQueue.remove());
        }
        return result;
    }

    private static void printList(List<Integer> nums){
        for(Integer num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        printList((new Solution()).topKFrequent(nums, k));
    }
}