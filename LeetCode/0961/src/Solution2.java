import java.util.HashSet;

/**
 * Created by 老蹄子 on 2019/1/30 下午8:37
 */
public class Solution2 {
    HashSet<Integer> myHash = new HashSet<Integer>();
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (myHash.contains(A[i])) {
                return A[i];
            }
            else {
                myHash.add(A[i]);
            }
        }
        return -1;
    }
}
