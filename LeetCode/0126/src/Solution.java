import java.util.*;

/**
 * 126. 单词接龙 II
 * https://leetcode-cn.com/classic/problems/word-ladder-ii/description/
 * Created by 老蹄子 on 2019/3/15 下午7:12
 */
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dict = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> nodeNeighbors = new HashMap<>();
        HashMap<String,Integer> distance = new HashMap<>();
        ArrayList<String> solution = new ArrayList<>();
        dict.add(beginWord);
        bfs(beginWord, endWord, dict, nodeNeighbors, distance);
        dfs(beginWord, endWord, dict, nodeNeighbors, distance, solution, res);
        return res;
    }

    private void bfs(String beginWord, String endWord, Set<String> dict,
                     Map<String, List<String>> nodeNeighbors,
                     Map<String, Integer> distance) {
        for (String str : dict) {
            nodeNeighbors.put(str,new ArrayList<>());
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        distance.put(beginWord,0);
        while (!queue.isEmpty()) {
            int count = queue.size();
            boolean foundEnd = false;
            for (int i = 0; i < count; i++) {
                String cur = queue.poll();
                int curDistance = distance.get(cur);
                List<String> neighbors = getNeighbors(cur,dict);
                for (String neighbor : neighbors) {
                    nodeNeighbors.get(cur).add(neighbor);
                    if (!distance.containsKey(neighbor)) {
                        distance.put(neighbor,curDistance + 1);
                        if (endWord.equals(neighbor)) {
                            foundEnd = true;
                        } else {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
            if (foundEnd) {
                break;
            }
        }
    }

    private ArrayList<String> getNeighbors(String node, Set<String> dict) {
        ArrayList<String> res = new ArrayList<String>();
        char chs[] = node.toCharArray();

        for (char ch ='a'; ch <= 'z'; ch++) {
            for (int i = 0; i < chs.length; i++) {
                if (chs[i] == ch) continue;
                char old_ch = chs[i];
                chs[i] = ch;
                if (dict.contains(String.valueOf(chs))) {
                    res.add(String.valueOf(chs));
                }
                chs[i] = old_ch;
            }

        }
        return res;
    }

    private void dfs(String cur, String endWord, Set<String> dict,
                     Map<String, List<String>> nodeNeighbors,
                     Map<String, Integer> distance, List<String> solution,
                     List<List<String>> res) {
        solution.add(cur);
        if (endWord.equals(cur)) {
            res.add(new ArrayList<>(solution));
        } else {
            for (String next : nodeNeighbors.get(cur)) {
                if (distance.get(next) == distance.get(cur) + 1) {
                    dfs(next,endWord,dict,nodeNeighbors,distance,solution,res);
                }
            }
        }
        solution.remove(solution.size() - 1);
    }

}
