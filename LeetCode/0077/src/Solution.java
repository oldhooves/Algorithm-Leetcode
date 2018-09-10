import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77. 组合
 * https://leetcode-cn.com/problems/combinations/description/
 * Created by 老蹄子 on 2018/9/10 下午9:34
 */
class Solution {

    private ArrayList<List<Integer>> res;

    public List<List<Integer>> combine(int n, int k) {

        res = new ArrayList<>();
        if (n <= 0 || k <= 0 || k > n){
            return res;
        }

        LinkedList<Integer> c = new LinkedList<>();
        generateCombinations(n,k,1,c);

        return res;
    }

    private void generateCombinations(int n, int k, int start, LinkedList<Integer> c){

        if (c.size() == k){
            res.add((List<Integer>)c.clone());
            return;
        }

        for (int i = start; i <= n; i++) {
            c.addLast(i);
            generateCombinations(n,k,i+1,c);
            c.removeLast();
        }

        return;
    }

    private static void printList(List<Integer> list){
        for(Integer e: list)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        List<List<Integer>> res = (new Solution()).combine(4, 2);
        for(List<Integer> list: res)
            printList(list);
    }
}
