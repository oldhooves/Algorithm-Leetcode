import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 658. 找到 K 个最接近的元素
 * https://leetcode-cn.com/classic/problems/find-k-closest-elements/description/
 * Created by ${laotizi} on 2019-03-13.
 */
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0, end = arr.length-k;
        while(start<end) {
            int mid = (start + end)/2;
            if (x - arr[mid] > arr[mid+k]-x)
                start = mid + 1;
            else
                end = mid;
        }
        List<Integer> results = new ArrayList<Integer>();
        for(int i=start;i<start+k;i++){
            results.add(arr[i]);
        }
        return results;
    }
}