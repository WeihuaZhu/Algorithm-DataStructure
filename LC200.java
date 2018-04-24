class LC200 {
    class UnionFind {
        private int[] father;
        private int count;
        private int[] rank;
        
        public UnionFind(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            count = 0;
            father = new int[m * n];
            rank = new int[m * n];
            for (int i = 0; i<m; i++)
                for (int j = 0; j<n; j++) {
                    if (grid[i][j] == '1') {
                        int id = i*n + j;
                        father[id] = id;
                        count++;                        
                    }
                    
                }
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
        
        public int find (int x) {  
            if (father[x] == x) {  
                return x;
            }
            return father[x] = find(father[x]);  
            
        }
        
        public int getCount() {
            return count;
        }
        
    }
    
    public int numIslands(char[][] grid) {
        int[][] distance = {{1,0},{-1,0},{0,1},{0,-1}};
        if (grid == null || grid.length == 0 || grid[0].length == 0)  {
            return 0;  
        }
        UnionFind uf = new UnionFind(grid);  
        int rows = grid.length;  
        int cols = grid[0].length;  
        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                if (grid[i][j] == '1') {  
                    for (int[] d : distance) {
                        int x = i + d[0];
                        int y = j + d[1];
                        if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == '1') {  
                            int id1 = i*cols+j;
                            int id2 = x*cols+y;
                            uf.union(id1, id2);  
                        }  
                    }  
                }  
            }  
        }  
        return uf.getCount();
        
    }
}