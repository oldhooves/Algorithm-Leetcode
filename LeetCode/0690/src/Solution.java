import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 690. 员工的重要性
 * https://leetcode-cn.com/problems/employee-importance/description/
 * Created by 老蹄子 on 2018/11/20 下午3:52
 */
class Solution {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };

    Map<Integer,Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id,e);
        }
        return dfs(id);
    }

    private int dfs(int eid) {
        Employee employee = map.get(eid);
        int ans = employee.importance;
        for (Integer subId : employee.subordinates) {
            ans += dfs(subId);
        }
        return ans;
    }
}