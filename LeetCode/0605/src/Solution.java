/**
 * 605. 种花问题
 * https://leetcode-cn.com/problems/can-place-flowers/description/
 * Created by 老蹄子 on 2018/10/1 下午6:59
 */
class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int sum = 0;

        int leftNum = 0;
        int rightNum = 0;
        int leftIndex = 0;
        int rightIndex = flowerbed.length - 1;
        boolean allZero = true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1){
                allZero = false;
            }
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1){
                leftIndex = i;
                break;
            }
            leftNum++;
        }
        for (int i = flowerbed.length - 1; i >= 0; i--) {
            if (flowerbed[i] == 1){
                rightIndex = i;
                break;
            }
            rightNum++;
        }

        if (allZero){
            sum = (leftNum + 1) / 2;
        }else {
            int left = leftNum == 1 ? 0 : leftNum / 2;
            int right = rightNum == 1 ? 0 : rightNum / 2;
            sum = left + right;
        }


        int temp = 0;
        for (int i = leftIndex; i <= rightIndex; i++) {

            if (flowerbed[i] == 0){
                temp++;
            }else {
                if (temp == 0){
                    continue;
                }else {
                    sum += (temp - 1) / 2;
                    temp = 0;
                }
            }
        }

        return sum >= n;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,0,0};
        System.out.println(new Solution().canPlaceFlowers(nums,1));
    }
}
