class LC547 {
    class UnionFind {
        private int[] father;
        private int count;
        private int[] rank;
        
        public UnionFind(int n) {
            father = new int[n];
            count = n;
            for (int i=0; i<n; i++) {
                father[i] = i;
            }
            rank = new int[n];
        }
        
        public int find(int x) {
            if (father[x] == x)
                return x;
            return father[x] = find(father[x]);
        }
        
        public void union(int a, int b) {
            int root_a = find(a);
            int root_b = find(b);
            if (root_a == root_b)
                return;
            
            if (rank[root_a] > rank[root_b]) {
                father[root_a] = root_b;
            }
            else {
                father[root_b] = root_a;
                if (rank[root_a] == rank[root_b]) {
                    rank[root_a]++;
                }
            }
            count--;
        }
        
        public int getCount() {
            return count;
        }
        
        
        
    }
    
    
    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) uf.union(i, j);
            }
        }
        return uf.getCount();
        
        
    }
}