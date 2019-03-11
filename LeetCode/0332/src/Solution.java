import java.util.*;

/**
 * 332. 重新安排行程
 * https://leetcode-cn.com/classic/problems/reconstruct-itinerary/description/
 * Created by 老蹄子 on 2019/3/11 下午7:38
 */
class Solution {

    Map<String, PriorityQueue<String>> targets = new HashMap<>();
    List<String> route = new LinkedList();


    public List<String> findItinerary(String[][] tickets) {
        for (String[] ticket : tickets){
            if (!targets.containsKey(ticket[0])) {
                PriorityQueue<String> priorityQueue = new PriorityQueue<>();
                priorityQueue.add(ticket[1]);
                targets.put(ticket[0],priorityQueue);
            }else {
                targets.get(ticket[0]).add(ticket[1]);
            }
        }
//            targets.computeIfAbsent(ticket[0], k -> new PriorityQueue()).add(ticket[1]);
        visit("JFK");
        return route;
    }

    private void visit(String airport) {
        while(targets.containsKey(airport) && !targets.get(airport).isEmpty())
            visit(targets.get(airport).poll());
        route.add(0, airport);
    }

    public static void main(String[] args) {
        String[][] tickets = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        System.out.println(new Solution().findItinerary(tickets));
    }
}
