/**
 * Created by 老蹄子 on 2018/11/12 下午9:56
 */
public class Solution2 {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int k = 1;
        while (k < n) {
            ugly[k] = min(ugly[index2] * 2,ugly[index3] * 3,ugly[index5] * 5);
            if (ugly[index2] * 2 == ugly[k]) {
                index2++;
            }
            if (ugly[index3] * 3 == ugly[k]) {
                index3++;
            }
            if (ugly[index5] * 5 == ugly[k]) {
                index5++;
            }
            k++;
        }
        return ugly[n - 1];
    }

    private int min(int a,int b,int c){
        return a > b ? (b < c ? b : c) : (a < c ? a : c);
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().nthUglyNumber(10));
    }
}
