/**
 * 165. 比较版本号
 * https://leetcode-cn.com/problems/compare-version-numbers/description/
 * Created by 老蹄子 on 2018/10/25 上午10:52
 */
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length;
        int len2 = v2.length;
        int len = Math.max(len1,len2);
        for (int i = 0; i < len; i++) {
            Integer ver1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer ver2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            int compare = ver1.compareTo(ver2);
            if (compare != 0){
                return compare;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().compareVersion("01","1"));
    }
}
