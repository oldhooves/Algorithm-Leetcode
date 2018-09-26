/**
 * Created by 老蹄子 on 2018/9/26 下午10:59
 */
class Solution2 {
    public boolean isMonotonic(int[] A) {
        if( ins(A)||mi(A) ){
            return true;
        }
        return false;
    }

    //递增
    private boolean ins(int[]A){
        for(int i =0 ; i<A.length-1; i++){
            if(A[i]>A[i+1]){
                return false;
            }
        }
        return true;
    }

    //递减
    private boolean mi(int[]A){
        for(int i =0 ; i<A.length-1; i++){
            if(A[i]<A[i+1]){
                return false;
            }
        }
        return true;
    }
}
