import java.util.HashMap;

/**
 * 447. 回旋镖的数量
 * https://leetcode-cn.com/problems/number-of-boomerangs/description/
 * Created by 老蹄子 on 2018/9/4 下午2:29
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {

        int result = 0;

        for (int i = 0; i < points.length; i++) {

            HashMap<Integer,Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (j != i){
                    int distance = distance(points[i],points[j]);
                    if (map.containsKey(distance)){
                        map.put(distance,map.get(distance)+1);
                    }else {
                        map.put(distance,1);
                    }
                }
            }
            for (Integer dis : map.keySet()){
                result += map.get(dis) * (map.get(dis)-1);
            }

        }
        return result;
    }

    private int distance(int[] pa,int[] pb){
        return (pa[0] - pb[0])*(pa[0] - pb[0])+
                (pa[1] - pb[1])*(pa[1] - pb[1]);
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println((new Solution()).numberOfBoomerangs(points));
    }
}