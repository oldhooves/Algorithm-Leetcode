/**
 * Created by 老蹄子 on 2018/10/1 下午2:39
 */
class Solution {
    public int maxDistToClosest(int[] seats) {
        int maxNum = 0;
        int temp = -1;
        int num = 0;
        int leftNum = 0;
        int rightNum = 0;
        int edgeNum = 0;
        int left = -1;
        int right = -1;
        if (seats[0] == 0){
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 0){
                    leftNum++;
                }else {
                    break;
                }
            }
        }
        if (seats[seats.length - 1] == 0){
            for (int i = seats.length - 1; i > 0; i--) {
                if (seats[i] == 0){
                    rightNum++;
                }else {
                    break;
                }
            }
        }
        edgeNum = Math.max(leftNum,rightNum);

        for (int i = 0; i < seats.length - 1; i++) {
            if (seats[i] == 1){
                left = i;
                break;
            }
        }
        for (int i = seats.length - 1; i > 0; i--) {
            if (seats[i] == 1){
                right = i;
                break;
            }
        }

        if (left >= 0 && right <= seats.length - 1 && left <= right){
            for (int i = left; i <= right; i++) {
                if (seats[i] == 0){
                    num++;
                    if (num > maxNum){
                        maxNum = num;
                        temp = i;
                    }
                }else {
                    num = 0;
                }
            }
        }

        if(maxNum <= 2 * edgeNum - 1 && edgeNum > 0){
            return edgeNum;
        }
        else {
            return (maxNum - 1) / 2 + 1;
        }

    }

    public static void main(String[] args) {
        int[] seats = {1,0,0,0,1,0,1};
        int[] seats2 = {0,0,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0};
        int[] seats3 = {0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1};
        System.out.println(new Solution().maxDistToClosest(seats));
    }
}
