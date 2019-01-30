import java.util.Arrays;

/**
 * 957. N 天后的牢房
 * https://leetcode-cn.com/problems/prison-cells-after-n-days/description/
 * Created by 老蹄子 on 2019/1/30 下午8:06
 */
class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] firstSimulation = new int[8];
        for (int i = 1; i < 7; i++) {
            firstSimulation[i] = (cells[i - 1] == cells[i + 1] ? 1 : 0);
        }
        cells = firstSimulation.clone();
        N -= 1;
        int cycle = 1;
        while (N-- > 0) {
            int[] nextSimulation = new int[8];
            for (int i = 1; i < 7; i++) {
                nextSimulation[i] = (cells[i - 1] == cells[i + 1] ? 1 : 0);
            }
            if (Arrays.equals(firstSimulation, nextSimulation)) {
                N %= cycle;
            }
            cells = nextSimulation.clone();
            cycle++;
        }
        return cells;
    }
}