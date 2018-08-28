import java.util.HashSet;

/**
 * 547. 朋友圈
 * https://leetcode-cn.com/problems/friend-circles/description/
 * Created by 老蹄子 on 2018/8/28 下午4:54
 */
class Solution {

    private interface UF{
        int getSize();
        boolean isConnected(int p,int q);
        void unionElements(int p,int q);
    }

    private class UnionFind implements UF{

        private int[] rank;
        private int[] parent;

        public UnionFind(int size) {
            rank = new int[size];
            parent = new int[size];

            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }



        @Override
        public int getSize() {
            return parent.length;
        }

        private int find(int p){
            if(p < 0 || p >= parent.length){
                throw new IllegalArgumentException("越界");
            }
            while (p != parent[p]){
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        @Override
        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

        @Override
        public void unionElements(int p, int q) {

            int pRoot = find(p);
            int qRoot = find(q);

            if (pRoot == qRoot){
                return;
            }

            if (rank[pRoot] < rank[qRoot]){
                parent[pRoot] = qRoot;
            }
            else if (rank[qRoot] < rank[pRoot]){
                parent[qRoot] = pRoot;
            }
            else {
                parent[pRoot] = qRoot;
                rank[qRoot] += 1;
            }
        }
    }



    public int findCircleNum(int[][] M) {

        int n = M.length;
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (M[i][j] == 1){
                    unionFind.unionElements(i,j);
                }
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            set.add(unionFind.find(i));
        }
        return set.size();
    }
}
