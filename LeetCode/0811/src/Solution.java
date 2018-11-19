import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. 子域名访问计数
 * https://leetcode-cn.com/problems/subdomain-visit-count/description/
 * Created by 老蹄子 on 2018/11/19 下午8:41
 */
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for (int i = frags.length - 1; i >= 0; i--) {
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                map.put(cur,map.getOrDefault(cur,0) + count);
            }
        }
        List<String> res = new ArrayList<>();
        for (String dom : map.keySet()) {
            res.add("" + map.get(dom) + " " + dom);
        }
        return res;
    }
}
